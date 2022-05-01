package controller.Statistic;

import DAO.Admin.TKCustomerDB;
import DAO.JsonReturnObject;
import DAO.UserDB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import model.Customer;

import javax.json.JsonArray;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "CustomerStatistic", urlPatterns = "/manage-customer")


public class CustomerStatistic extends HttpServlet {
    private Gson gson = new GsonBuilder().create();
    Object key = new Object();

    @Override
    protected synchronized void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        TKCustomerDB db = new TKCustomerDB();
        List<Customer> list = db.getListCustomer();
        String body = gson.toJson(list);
        PrintWriter out = resp.getWriter();
        out.write(body);
        out.close();

    }

    @Override
    protected synchronized void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        Customer c = this.gson.fromJson(req.getReader(), Customer.class);
        TKCustomerDB admindb = new TKCustomerDB();
        String status = "200";
        String message = "Thêm thành công";
        if (admindb.addCustomer(c) == false) {
            status = "500";
            message = "Thêm không thành công";
        }

        List<Customer> data = admindb.getListCustomer();
        PrintWriter out = resp.getWriter();
        JsonReturnObject<Customer> json = new JsonReturnObject<>(status, message, data);
        out.write(gson.toJson(json));
        out.close();

    }

    @Override
    protected synchronized void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        Customer c = this.gson.fromJson(req.getReader(), Customer.class);
        TKCustomerDB admindb = new TKCustomerDB();
        String status = "200";
        String message = "Update thành công";
        if (admindb.checkCustomerById(c.getId())) {
            admindb.updateCustomer(c);
        } else {
            message = "Khách hàng không tồn tại!";
            status = "500";
        }
        PrintWriter out = resp.getWriter();
        List<Customer> data = admindb.getListCustomer();
        JsonReturnObject<Customer> json = new JsonReturnObject<>(status, message, data);
        out.write(gson.toJson(json));
        out.close();

    }

    @Override
    protected synchronized void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");


        JsonObject jobj = this.gson.fromJson(req.getReader(), JsonObject.class);
        String id = jobj.get("id").getAsString();
        // perform authentication
        String status = "200";
        String message = "Id này không tồn tại!";
        PrintWriter out = resp.getWriter();
        TKCustomerDB admindb = new TKCustomerDB();
        if (id != null) {
            UserDB userdb = new UserDB();
            Customer customer = admindb.getCustomerById(Integer.parseInt(id));

            if (customer == null) {
                status = "500";
                message = "Không tồn tại khách hàng này!";
            } else {
                admindb.deleteCustomerById(Integer.parseInt(id));
                message = "Xóa khách hàng thành công!";
            }

        }
        List<Customer> data = admindb.getListCustomer();
        JsonReturnObject<Customer> json = new JsonReturnObject<>(status, message, data);
        out.write(gson.toJson(json));
        out.close();
    }
}


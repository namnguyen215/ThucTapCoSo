package controller.Statistic;

import DAO.Admin.TKBookedRoomDB;
import DAO.Admin.TKCustomerDB;
import DAO.JsonReturnObject;
import DAO.UserDB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import model.BookedRoom;
import model.BookedRoomInfo;
import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "BookedroomStatistic", urlPatterns = "/manage-bookedroom")


public class BookedRoomStatistic extends HttpServlet {
    private Gson gson = new GsonBuilder().create();

    @Override
    protected synchronized void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        TKBookedRoomDB db = new TKBookedRoomDB();
        List<BookedRoomInfo> list = db.getListBookedRoomInfo();
        String body = gson.toJson(list);
        PrintWriter out = resp.getWriter();
        out.write(body);
        out.close();
    }


    @Override
    protected synchronized void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        BookedRoom bk = this.gson.fromJson(req.getReader(), BookedRoom.class);
        TKBookedRoomDB admindb = new TKBookedRoomDB();
        String status = "200";
        String body = "Update thành công";
        if (admindb.isUpdatable(bk)) {
            admindb.updateBookedRoom(bk);
        } else {
            body = "Khách hàng không tồn tại!";
            status = "500";
        }
        PrintWriter out = resp.getWriter();
        List<BookedRoomInfo> data = admindb.getListBookedRoomInfo();
        JsonReturnObject<BookedRoomInfo> json = new JsonReturnObject<>(status, body, data);
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
        String body = "Id này không tồn tại!";
        PrintWriter out = resp.getWriter();
        TKBookedRoomDB admindb = new TKBookedRoomDB();
        if (id != null) {
            UserDB userdb = new UserDB();

            BookedRoom bookedRoom = admindb.getBookedRoomById(Integer.parseInt(id));

            if (bookedRoom == null) {
                status = "500";
                body = "Phòng này chưa được đặt!";
            } else {
                admindb.deleteBookedRoomById(Integer.parseInt(id));
                body = "Xóa phòng được thành công!";
            }

        }
        List<BookedRoomInfo> data = admindb.getListBookedRoomInfo();
        JsonReturnObject<BookedRoomInfo> json = new JsonReturnObject<>(status, body, data);
        out.write(gson.toJson(json));
        out.close();
    }
}


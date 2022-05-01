package controller.login;

import DAO.CustomerDB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.topLocation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name="GetTopLocation",urlPatterns = "/get-top-location")
public class GetTopLocation extends HttpServlet {
    private Gson gson = new GsonBuilder().create();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        CustomerDB db=new CustomerDB();
        List<topLocation> list = db.getTopLocation();
        String body =gson.toJson(list);
        PrintWriter out = resp.getWriter();
        out.write(body);
        out.close();
    }


}

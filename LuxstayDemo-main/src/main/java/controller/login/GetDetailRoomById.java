package controller.login;

import DAO.RoomDB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Room;
import model.listRoomByLocation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name="GetDetailRoomById",urlPatterns = "/get-detail-room-by-id")
public class GetDetailRoomById extends HttpServlet {
    private Gson gson = new GsonBuilder().create();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");


        String id =this.gson.fromJson(req.getReader(),String.class);
        RoomDB db=new RoomDB();
        List<Room> list = db.getDetailRoomById(id);
        String body =gson.toJson(list);
        PrintWriter out = resp.getWriter();
        out.write(body);
        out.close();
    }
}

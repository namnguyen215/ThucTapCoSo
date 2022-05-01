package controller.Statistic;

import DAO.Admin.TKRoomDB;
import DAO.JsonReturnObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import model.BookedRoomInfo;
import model.Room;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name="RoomStatistic",urlPatterns = "/manage-room")


public class RoomStatistic extends HttpServlet {
    private Gson gson = new GsonBuilder().create();
    @Override
    protected synchronized void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        TKRoomDB db=new TKRoomDB();
        List<Room> list = db.getListRoom();
        String body =gson.toJson(list);
        PrintWriter out = resp.getWriter();
        out.write(body);
        out.close();
    }

    @Override
    protected synchronized void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        Room room= this.gson.fromJson(req.getReader(),Room.class);
        TKRoomDB admindb=new TKRoomDB();
        String status="200";
        String body ="Thêm thành công";
        if(admindb.addRoom(room)==false){
            status="500";
            body ="Thêm không thành công";
        }
        PrintWriter out = resp.getWriter();
        List<Room> data = admindb.getListRoom();
        JsonReturnObject<Room> json = new JsonReturnObject<>(status, body, data);
        out.write(gson.toJson(json));
        out.close();
    }

    @Override
    protected synchronized void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        Room room= this.gson.fromJson(req.getReader(),Room.class);
        TKRoomDB admindb=new TKRoomDB();
        String status="200";
        String body="Update thành công";
        if(admindb.checkRoomById(room.getId())){
            admindb.updateRoom(room);
        }
        else{
            body ="Phòng không tồn tại!";
            status="500";
        }
        PrintWriter out = resp.getWriter();
        List<Room> data = admindb.getListRoom();
        JsonReturnObject<Room> json = new JsonReturnObject<>(status, body, data);
        out.write(gson.toJson(json));
        out.close();
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");


        JsonObject jobj= this.gson.fromJson(req.getReader(), JsonObject.class);
        String id=jobj.get("id").getAsString();
        // perform authentication
        String status="200";
        String body ="Id này không tồn tại!";
        PrintWriter out = resp.getWriter();
        TKRoomDB admindb=new TKRoomDB();
        if(id!=null){

            Room room=admindb.getRoomById(Integer.parseInt(id));

            if (room==null)
            {
                status="500";
                body="Không tồn tại phòng này!";
            }
            else
            {
                admindb.deleteRoomById(Integer.parseInt(id));
                body="Xóa phòng thành công!";
            }

        }
        List<Room> data = admindb.getListRoom();
        JsonReturnObject<Room> json = new JsonReturnObject<>(status, body, data);
        out.write(gson.toJson(json));
        out.close();
    }
}


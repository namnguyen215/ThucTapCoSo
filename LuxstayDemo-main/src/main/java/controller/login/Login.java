package controller.login;

import DAO.UserDB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Login",urlPatterns = "/login")
public class Login extends HttpServlet {
    private Gson gson = new GsonBuilder().create();
    public Login() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        User user = this.gson.fromJson(req.getReader(), User.class);
        UserDB db=new UserDB();
        String body ="";
        PrintWriter out = resp.getWriter();
        if(db.checkUser(user.getEmail(), user.getPassword())){
            user=db.getUser(user.getEmail(), user.getPassword());
            body = gson.toJson(user);
            out.write(body);
        }
        else{
            body = gson.toJson("User không tồn tại");
        }
        if(user.getRole().equalsIgnoreCase("customer")){

        }
        out.close();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }


}

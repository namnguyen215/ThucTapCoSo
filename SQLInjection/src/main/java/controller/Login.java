package controller;
import DAO.UserDB;
//import com.google.gson.Gson;
import model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Login extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String url="/index.jsp";
        String message1="",message2="",message3="";
        String bt=req.getParameter("register");

        System.out.println("Here is the button name: "+bt);

        UserDB db=new UserDB();

        boolean ok=true;
        if(username.length()==0){
            message1="*Please check username";
            ok=false;
        }
        if(password.length()==0){
            message2="*Please check password";
            ok=false;
        }
        if(ok==true){
            if(bt!=null){
                if(db.checkUser(username,password)==true){
                    message3="*User is existed!";
                }
                else{
                    db.addUser(username,password);
                    url="/index.jsp";
                    message3="*Register successful!";
                }
            }
            else if(bt==null){
                if(db.checkUser(username,password)==true){
                    url="/login_successful.jsp";
                }
                else{
                    message3="*Please check username and password";
                }
            }

        }


//        Gson gson = new Gson();
//        String body = gson.toJson("Login ok");
//        PrintWriter out = resp.getWriter();
//        out.write(body);
//        out.close();


        req.setAttribute("message1",message1);
        req.setAttribute("message2", message2);
        req.setAttribute("message3", message3);
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }
}

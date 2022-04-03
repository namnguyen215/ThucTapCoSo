package controller;
import DAO.UserDB;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String url="/index.jsp";
        String message1="",message2="";
        UserDB db=new UserDB();
        if(username.length()==0 || password.length()==0){
            message1="*Please check username and password";
        }
        if(db.checkUser(username,password)==true){
            url="/login_successful.jsp";
        }
        req.setAttribute("message1",message1);
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }
}

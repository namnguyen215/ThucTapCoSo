/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import business.User;
import dal.DAO;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NamNguyen
 */
public class Login extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.jsp";
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        String message1 = "", message2 = "";
        
        DAO database = new DAO();
        
        System.out.println(database.getUserByUsername("nam"));
        if (username.length()==0 || password.length() == 0) {
            url = "/index.jsp";
            message1 = "Please type in the username!";
            message2 = "Please type in the username!";
        }
        else {
            User user = database.getUserByUsername(username);
            if (user == null) {
                url = "/login_successful.jsp";
                database.insert(user);
            } else {
                url = "/index.jsp";
                message1 = "*Username has ben registered";
            }
        }

        request.setAttribute("message1", message1);
        request.setAttribute("message2", message2);
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}

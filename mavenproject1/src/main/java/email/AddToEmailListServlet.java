/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import business.User;
import data.UserDB;

/**
 *
 * @author NamNguyen
 */
public class AddToEmailListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException,
            IOException {
// get parameters from the request
        String username
                = request.getParameter("username");
        String password = request.getParameter("password");
        // create the User object
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        String url = "";
        String message = "";
        if (UserDB.emailExists(user.getUsername())) {
            message
                    = "This username address already exists<br>"
                    + "Please enter another email address.";
            url = "/join_email_list.jsp";
        } else {
            UserDB.insert(user);
            url = "/login_successful";
        }

        // store the user and message in the session
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        request.setAttribute("message", message);
        // forward the request and response to the view
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}

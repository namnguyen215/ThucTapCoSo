package download;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import business.User;
import data.UserDB;

public class RegisterUserServlet extends HttpServlet {

//    public void doPost(HttpServletRequest request,
//            HttpServletResponse response)
//            throws IOException, ServletException {
//        String firstName
//                = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//        String emailAddress
//                = request.getParameter("emailAddress");
//        User user = new User();
//        user.setFirstName(firstName);
//        user.setLastName(lastName);
//        user.setEmailAddress(emailAddress);
//        ServletContext sc = getServletContext();
//        String path
//                = sc.getRealPath("WEB-INF/EmailList.txt");
//        UserDB.insert(user, path);
//
//        
//        
//        HttpSession session = request.getSession();
//        session.setAttribute("user", user);
//        String productCode
//                = (String) session.getAttribute("productCode");
//        Cookie emailCookie = new Cookie(
//                "emailCookie", emailAddress);
//        //set its age to 2 years
//        emailCookie.setMaxAge(60 * 60 * 24 * 365 * 2);
//        //allow the entire application to access it
//        emailCookie.setPath("/");
//        response.addCookie(emailCookie);
//
//        String url = "/" + productCode + "_download.jsp";
//        RequestDispatcher dispatcher
//                = getServletContext().getRequestDispatcher(url);
//        dispatcher.forward(request, response);
//    }
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
        String url = "";

        User user = new User(firstName, lastName, emailAddress);
        // get a relative file name
        ServletContext sc = getServletContext();
        String path
                = sc.getRealPath("WEB-INF/EmailList.txt");

        System.out.println(path);
        String message1 = "", message2 = "", message3 = "", message4 = "";
        boolean ok = true;
        //validate input form
        if (firstName.length() == 0) {

            message1 = "*Please input first name";
            ok = false;
        }
        if (lastName.length() == 0) {

            message2 = "*Please input last name";
            ok = false;
        }
        if (emailAddress.matches("\\w+@\\w+\\.com$") == false) {

            message3 = "*Please check the email!";
            ok = false;
        }

        if (UserDB.checkExistEmail(user, path) == true) {
            message3 = "*Email has existed";
            ok = false;
        }
        if (ok == true) {
            UserDB.insert(user, path);
            Cookie emailCookie = new Cookie("emailCookie", emailAddress);
            //set age up to 1 years
            emailCookie.setMaxAge(60 * 60 * 24 * 365);
            emailCookie.setPath("/");
            response.addCookie(emailCookie);

            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            String productCode = (String) session.getAttribute("productCode");
            url = "/" + productCode + "_download.jsp";

        } else {
            url = "/register.jsp";
        }
        //request.setAttribute("user", user);

        // send response to browser
        request.setAttribute("message1", message1);
        request.setAttribute("message2", message2);
        request.setAttribute("message3", message3);
        request.setAttribute("message4", message4);
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}

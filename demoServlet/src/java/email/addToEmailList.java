package email;

import business.User;
import data.UserDB;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class addToEmailList extends HttpServlet {

    //Lay data tu request va tra ve response
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
        String url = "";
        String[] musics = request.getParameterValues("music");
        List<String> list;

        if (musics != null) {
            list = Arrays.asList(musics);
        } else {
            list = null;
        }
        User user = new User(firstName, lastName, emailAddress);
        // get a relative file name
        ServletContext sc = getServletContext();
        String path = this.getServletConfig().getInitParameter("linkEmailList");
        path = getServletContext().getRealPath(path);
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
        if (list == null) {
            message4 = "*Please fill the check box";
            ok = false;
        }
        if (UserDB.checkExistEmail(user, path) == true) {
            message3 = "*Email has existed";
            ok = false;
        }
        if (ok == true) {
            url = "/display_email_entry.jsp";
            // use regular Java objects to write the data to a file

            String musicOut = "";
            UserDB.insert(user, path);

            for (String music : list) {
                musicOut += music + " ";
            }
            request.setAttribute("user", user);
            request.setAttribute("list_music", musicOut);

        } else {
            url = "/index.jsp";
            request.setAttribute("user", user);
        }
        
        HttpSession session = request.getSession();
        session.setAttribute("email", user.getEmailAddress());


        LocalDate time=LocalDate.now();
        request.setAttribute("date", time);
        // send response to browser
        request.setAttribute("message1", message1);
        request.setAttribute("message2", message2);
        request.setAttribute("message3", message3);
        request.setAttribute("message4", message4);
        request.setAttribute("list", list);
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}

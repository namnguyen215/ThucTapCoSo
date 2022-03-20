package email;

import business.User;
import data.UserDB;
import java.io.*;
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
        String[] musics=request.getParameterValues("music");
        List<String> list=Arrays.asList(musics);
        // get a relative file name
        ServletContext sc = getServletContext();
        String path = sc.getRealPath("/WEB-INF/EmailList.txt");
        
        //validate input form
        
        
        
        // use regular Java objects to write the data to a file
        User user = new User(firstName, lastName, emailAddress,list);
        UserDB.insert(user,path);
        String musicOut="";
        for(String music:list){
            musicOut+=music+" ";
        }
        System.out.println(list);
        
        
        
        // send response to browser
       request.setAttribute("user", user);
       request.setAttribute("list_music", musicOut);
       String url="/display_email_entry.jsp";
       sc.getRequestDispatcher(url).forward(request, response);
    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}

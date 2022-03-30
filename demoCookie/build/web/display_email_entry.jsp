<%-- 
    Document   : display_email_entry
    Created on : Mar 19, 2022, 12:09:37 AM
    Author     : NamNguyen
--%>

<%@page import="business.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Thanks for joining our email list</h1>
        <p>Here is the information that you entered:</p>
        <%User user = (User) request.getAttribute("user");%>
        <%String musicOut = (String)request.getAttribute("list_music");%>
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="right">First name: </td>
                <td><%= user.getFirstName()%></td>
            </tr>
            <tr>
                <td align="right">Last name: </td>
                <td><%= user.getLastName()%></td>
            </tr>
            <tr>
                <td align="right">Email address: </td>
                <td><%= user.getEmailAddress()%></td>
            </tr>
        </table>
            <p>We will notify you base on your favorite types of music: <%=musicOut%></p>
<!--            <p><%=musicOut%></p>-->
        <p>To enter another email address, click on the Back <br>
            button in your browser or the Return button shown <br>
            below.</p>
        <!--        <form action="join_email_list.html" method="post">
                    <input type="submit" value="Return">
                </form>-->
        <form action="index.jsp" method="post">
            <input type="submit" value="Return">
        </form>
    </body>
</html>

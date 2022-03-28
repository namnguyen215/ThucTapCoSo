<%@page import="util.CookieUtil"%>
<%@page import="business.User"%>
<!doctype html public 
    "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
        <title>Murach's Java Servlets and JSP</title>
    </head>
    <body>
        <%String notification = "You haven't log in yet!";
            User user = (User) session.getAttribute("user");
            if (user == null) {
                //Check trong cookies xem co user khong
                Cookie[] cookies = request.getCookies();
                String emailAddress = CookieUtil.getCookieValue(
                        cookies, "emailCookie");
                if (emailAddress != null
                        && !emailAddress.equals("")) {
                    notification = "Your email addres: " + emailAddress;
                }

            } else {
                notification="Your email address: " +user.getEmailAddress();
            }%>
        <p><%=notification%></p>
        <h1>List of albums</h1>
        <p>
            <a href="<%=response.encodeURL("checkUser?productCode=8601")%>">
                86 (the band) - True Life Songs and Pictures
            </a><br>

            <a href=
               "<%=response.encodeURL("checkUser?productCode=pf01")%>">
                Paddlefoot - The first CD
            </a><br>
            <a href=
               "<%= response.encodeURL("checkUser?productCode=pf02")%>">
                Paddlefoot - The second CD
            </a><br>
            <a href=
               "<%= response.encodeURL("checkUser?productCode=jr01")%>">
                Joe Rut - Genuine Wood Grained Finish
            </a>
        </p>
    </body>
</html>

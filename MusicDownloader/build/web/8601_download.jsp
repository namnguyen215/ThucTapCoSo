<html>
    <head>
        <title>Murach's Java Servlets and JSP</title>
    </head>
    <body>
        <%
            String productCode = (String) session.getAttribute("productCode");
        %>
        <h1>Downloads</h1>
        <table cellpadding="5" border="1">
            <tr><td colspan="2"><b>86 (the band) - True Life Songs and 
                        Pictures</b></td>
            </tr>
            <tr><td width="200"><b>Song title</b></td>
                <td width="150"><b>Audio Format</b></td>
            </tr>
            <tr><td>You Are a Star</td>
                <td><a href=
                       "/musicStore/sound/<%=productCode%>/star.mp3">MP3</a>
                </td>
            </tr>
            <tr><td>Don't Make No Difference</td>
                <td><a href=
                       "/musicStore/sound/<%=productCode%>/no_difference.mp3">
                        MP3</a>
                </td>
            </tr>
        </table>
        <p><a href="<%= response.encodeURL("index.jsp")%>">
                View list of albums</a>.</p>
        <p><a href="<%= response.encodeURL("view_cookies.jsp")%>">
                View all cookies</a>.</p>
    </body>
</html>

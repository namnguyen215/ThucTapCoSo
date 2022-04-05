<%--
    Document   : index
    Created on : Mar 19, 2022, 12:00:39 AM
    Author     : NamNguyen
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>
<h1>Demo SQL Injection</h1>
<form action="Login" method="post">
    <table cellspacing="5" border="0">
        <tr>
            <td align="right">Username:</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td></td>
            <td>${message1}</td>
        </tr>
        <tr>
            <td align="right">Password</td>
            <td><input type="password" name="password" value=""></td>
        </tr>
        <tr>
            <td></td>
            <td>${message2}</td>
        </tr>
        <tr>
            <td></td>
            <td><br>
                <input type="submit" value="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
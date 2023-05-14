<%-- 
    Document   : login
    Created on : 13 May, 2023, 8:21:18 PM
    Author     : Shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Struts Login Page</title>
    </head>
    <body style="margin-left:40%; margin-top:10%;">
        <h1>Struts Login Form</h1>
        <s:form action="login_action">
            <s:textfield name="name" label="Enter your name: " required="true" />
            <s:textfield name="mobileno" label="Enter mobile No: " required="true" />
            <s:textfield name="email" label="Enter your email: " required="true" />
            <s:submit value="Login" align="center" />
        </s:form>
    </body>
</html>

<%-- 
    Document   : add
    Created on : 2016-07-16, 17:22:46
    Author     : Piotrek
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logowanie</title>
    </head>
    <body>
        <h1>Zaloguj</h1>
        <form:form commandName="person" action="save.htm" method="POST">
            <form:input path="email"/><br>
            <form:input path="name"/><br>
            <form:input path="lastName"/><br>
            <form:input path="companyName"/><br>
            
            <form:button>Zaloguj</form:button>
            
        </form:form>
    </body>
</html>

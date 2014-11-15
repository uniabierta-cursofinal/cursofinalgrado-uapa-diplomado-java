<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <c:out value="${1+2+3}"/>
         
        <br></br>
         
        <%= request.getParameter("parametro")%>
         
        <br></br>
         
        <c:out value="${param.parametro}"/>
         
        <br></br><br></br>
         
        <%application.setAttribute("atributo", "valor");%>
         
        <%= application.getAttribute("atributo") %>
         
        <br></br>
         
        <c:out value="${applicationScope.atributo}"/>
    </body>
</html>
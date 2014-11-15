<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        Valor de parametro1: 
        <%= request.getParameter("parametro1") %>
         
        <br></br>
         Valor de parametro2: 
        <%= request.getParameter("parametro2") %>
         
        <br></br>
         Valor de parametro &lsquo;clave&rsquo;: 
        <%= request.getParameter("clave") %>
    </body>
</html>
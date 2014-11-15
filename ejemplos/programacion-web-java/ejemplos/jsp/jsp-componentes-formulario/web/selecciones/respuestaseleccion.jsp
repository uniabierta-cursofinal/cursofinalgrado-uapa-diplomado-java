<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
Se marcaron las siguientes entradas:
<br>
<%
String[] seleccion=
request.getParameterValues("select");
for (int i=0;i<seleccion.length;i++)
{
%>
<%= seleccion[i] %>
<br>
<%
}
%>



    </body>
</html>
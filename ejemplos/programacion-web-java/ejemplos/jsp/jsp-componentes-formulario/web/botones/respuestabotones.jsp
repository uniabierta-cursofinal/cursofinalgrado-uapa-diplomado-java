<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
    <%
String radio= request.getParameter("radio");
if (radio!=null && radio.equalsIgnoreCase("uno"))
{
%>

Option 1 seleccionado en el formulario origen.
<%
}
else if(radio!=null && radio.equalsIgnoreCase("dos"))
{
%>
Option 2 seleccionado en el formulario origen.
<%

}
%>
    </body>
</html>
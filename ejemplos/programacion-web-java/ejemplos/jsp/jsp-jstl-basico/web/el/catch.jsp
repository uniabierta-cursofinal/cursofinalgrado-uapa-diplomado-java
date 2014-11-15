<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <c:catch var="error01">
            <%=Integer.parseInt(request.getParameter("parametro"))%>
        </c:catch>
         
        <c:if test="${not empty error01}">
            Se produjo un error:
            ${error01}
        </c:if>
         
        <br/>
         
        <form>
            <input type="hidden" name="parametro" value="prueba"/>
            <input type="submit" value="Enviar 'prueba'"/>
        </form>
         
        <form>
            <input type="hidden" name="parametro" value="1234"/>
            <input type="submit" value="Enviar '1234'"/>
        </form>
         
        <form>
            <input type="submit" value="No enviar el parámetro"/>
        </form>
    </body>
</html>
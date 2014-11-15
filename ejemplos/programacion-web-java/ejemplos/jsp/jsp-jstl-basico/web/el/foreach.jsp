<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <c:forEach items="${header}" var="cabecera">
            ${cabecera}
           <br></br>
        </c:forEach>
      
         
       <br></br>
        
        <% 
        String []cadenas={"uno","dos","tres"};
pageContext.setAttribute("cadenas",cadenas);
%>
         
        <c:forEach items="${pageScope.cadenas}" var="cadena">
            ${cadena}
        </c:forEach>
         
      <br></br>
       
        <c:forEach items="${param}" var="parametro">
            Nombre:
            ${parametro.key}
            Valor:
            ${parametro.value}
             <br></br>
        </c:forEach>
    </body>
</html>
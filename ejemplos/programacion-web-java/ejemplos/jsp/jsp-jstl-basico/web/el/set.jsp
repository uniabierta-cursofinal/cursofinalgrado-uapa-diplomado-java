<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <c:set var="variableDePagina" scope="page">Esta informaci&oacute;n se guarda en la p&aacute;gina
         
        </c:set>
         
        <c:set var="variableDeSesion" scope="session">Esta informaci&oacute;n se guarda en la sesi&oacute;n</c:set>
         
        <c:set var="variableDeAplicacion" scope="application">Esta informaci&oacute;n se guarda en la aplicaci&oacute;n</c:set>
         
        <br>${variableDePagina}
         
        <br/>${variableDeSesion}
         
        <br/>${variableDeAplicacion}
    </body>
</html>
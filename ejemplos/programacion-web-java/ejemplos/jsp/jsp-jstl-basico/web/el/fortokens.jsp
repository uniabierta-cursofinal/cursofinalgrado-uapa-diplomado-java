<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <c:forTokens items="cero, uno, dos, tres, cuatro, cinco" var="token" varStatus="status" delims=",">
            <br></br>
            ${status.index}
            .-
            ${token}
        </c:forTokens>
    </body>
</html>
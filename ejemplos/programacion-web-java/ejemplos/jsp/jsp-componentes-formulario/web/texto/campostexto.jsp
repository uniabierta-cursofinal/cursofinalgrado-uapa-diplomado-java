<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <form action="respuestacampostexto.jsp">
            <input type="text" name="parametro1" value="valor por defecto"/>
            <br></br>
            <input type="password" name="clave"/>
            <br></br>
            <textarea name="parametro2" cols="10" rows="10">Texto por defecto</textarea>
            <br></br>
            <input type="submit" name="btnSubmit" value="Aceptar"/>
        </form>
    </body>
</html>
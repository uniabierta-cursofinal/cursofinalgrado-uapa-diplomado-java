<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<%@ page import="org.cursofinalgrado.uapa.java.modelos.ModeloPais"%>
<%@ page import="org.cursofinalgrado.uapa.java.entidades.Pais"%>

<%@ page contentType="text/html;charset=UTF-8"%>
<jsp:include page="template/header.jsp"/>
<%
    List<Pais> pais = ModeloPais.getInstancia().getListadoPais();

%>
<form class="form-horizontal" action="/noticiasonline/CiudadController" method="post">
    <div class="form-group">
        <label>Nombre</label>
        <input type="text" name="inputNombre" style="width:50%;" id="inputNombre" class="form-control" placeholder="Nombre">
    </div>
    <div class="form-group">
        <label>Pais</label>
        <select name="inputPais">
            <c:forEach items="<%=pais%>" var="pais">
                <option value="${pais.getId()}">${pais.getNombre()}</option>
            </c:forEach>
        </select>
    </div>
    <div class="form-group">
        <button type="submit" class="btn btn-default" tabindex="3">Confirmar</button>
    </div>

</form>

<jsp:include page="template/footer.jsp"/>


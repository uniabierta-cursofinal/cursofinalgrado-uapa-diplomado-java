<%@ page contentType="text/html;charset=UTF-8"%>
<jsp:include page="template/header.jsp"/>

<form class="form-horizontal" action="/noticiasonline/CategoriaController" method="post">
    <div class="form-group">
        <label>Descripcion</label>
        <input type="text" name="inputDescripcion" style="width:50%;" id="inputDesc" class="form-control" placeholder="Descripcion">
    </div>

    <div class="form-group">
        <button type="submit" class="btn btn-default" tabindex="3">Confirmar</button>
    </div>

</form>

<jsp:include page="template/footer.jsp"/>

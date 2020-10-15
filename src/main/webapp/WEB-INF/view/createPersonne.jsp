<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Ajouter Personne</title>
</head>
<body>
<div class="container">
<div class="card-body">
<form action="savePersonne" method="post">
 <div class="form-group">
 <label class="control-label">Nom Personne :</label>
 <input type="text" name="nomPersonne" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Taille Personne :</label>
 <input type="text" name="taillePersonne" class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">date Enregistrement :</label>
 <input type="date" name="date" class="form-control"/>
 </div>

 <div>
 <button type="submit" class="btn btn-primary">Ajouter</button>
</div>
</form>
</div>
${msg}
<br/>
<br/>
<a href="listePersonnes">Liste Personnes</a>
</div>
</body>
</html>

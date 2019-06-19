<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="js/commun.js"></script>
	<link rel="stylesheet" href="css/commun.css">

<style type="text/css">


.centre {
	text-align: center;
}


img {
	vertical-align: bottom;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
		        <a  href="index.jsp" class="navbar-brand active">
		        <span class="glyphicon glyphicon-film"></span> 
		        <span class="glyphicon glyphicon-film"></span> 
		        </a>
		          <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		          </button>
		    </div>
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav navbar-right">
					<li ><a href="index.jsp">Accueil</a></li>
					<li class="active"><a href="#">Liste des vins</a></li>
					<li><a href="ajouter">Ajouter une bouteille</a></li>
					<li><a href="geo.jsp">Qui sommes-nous</a></li>
				</ul>
			</div>
		</div>
	</nav>	
	<div class="container">
	<h1 class="bleu">Liste des bouteilles</h1>
	<br><br>
	<table class="table table-hover table-striped">
		<tr>
			<th>Nom </th>
			<th>Millésime </th>
			<th>Pétillant</th>
			<th>Quantité</th>
			<th>Couleur</th>
			<th>Région</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${listeV}" var="f" varStatus="bStatus">
			<tr>
				<td><a href="afficher?index=${v.id}">${v.nom}</a></td>
				<td>${v.millesime}</td>
				<td>${v.petillant?"Oui":"Non"}</td>
				<td>${v.quantite}</td>
				<td>${v.couleur.nom}</td>
				<td>${f.duree}</td>	
				<td class="centre">
					<span class="modif glyphicon glyphicon-edit vert"  id="m${v.id}"></span>
				</td>
				<td class="centre">
					<span class="glyphicon glyphicon-remove rouge supp"  id="s${v.id}"></span>
				</td>
			</tr>
		</c:forEach>
	</table>


	</div>
	<jsp:include page="footer.jsp" />

</body>
</html>
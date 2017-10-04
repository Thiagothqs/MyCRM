<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
       <meta charset="utf-8">
	   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	   <title>Cadastrar Servi�o</title>
	   <meta name="description" content="">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
	
	   <link rel="stylesheet" href="../css/bootstrap.min.css">
	   <style>
	        body {
	            padding-top: 50px;
	            padding-bottom: 20px;
	        }
	   </style>
	   <link rel="stylesheet" href="../css/style.css">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css">     
    </head>
	<body>
		<c:import url="../inc/header.jsp"/>
	
		<!-- Conte�do principal da p�gina -->
		<main class="container">
		<h1>Cadastrar Servi�o</h1>
		<hr/>
			<form action="/MyCRM/InserirServicoServlet" method="post">
			    <div class="form-group">
			      <label for="campo1">Nome:</label>
			      <input type="text" size="50" class="form-control" id="nome" name="nome">
			    </div>
			    
			    <div class="form-group">
			      <label for="campo2">Tempo:</label>
			      <input type="text" class="form-control" id="tempo" name="tempo">
			    </div>
			    
			    <div class="form-group">
			      <label for="campo3">Valor:</label>
			      <input type="text" class="form-control" id="valor" name="valor">
			    </div>
			    
			    <div class="form-group">
			      <label for="campo3">Descri��o:</label>
			      <input type="text" class="form-control" id="valor" name="descricao">
			    </div>

			  
			  <div id="actions" class="row">
			    <div class="col-md-12">
			      <button type="submit" class="btn btn-primary">Salvar</button>
			      <a href="/MyCRM/index.jsp" class="btn btn-default">Cancelar</a>
			    </div>
			  </div>
			</form>
		</main>
		<c:import url="../inc/footer.jsp"/>
	</body>
</html>


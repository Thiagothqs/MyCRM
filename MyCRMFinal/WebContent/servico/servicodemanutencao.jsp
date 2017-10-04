<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
       <meta charset="utf-8">
	   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	   <title>My CRM</title>
	   <meta name="description" content="">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
	
	   <link rel="stylesheet" href="css/bootstrap.min.css">
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
	
		<!-- Conteúdo principal da página -->
		<main class="container">
		<h1>Cadastrar Serviço de Manutenção</h1>
		<hr/>
			<form action="/MyCRM/InserirServicoManutencaoServlet" method="post">
			    <div class="form-group">
			      <label for="campo1">Nome do Cliente:</label>
			      <select id="cliente" name="cliente">
 						<c:forEach var="cliente" items="${listaClientes}">
 							<option>${cliente.nomeCompleto}</option>
 						</c:forEach>
			      </select>
			    </div>
			    
			    <div class="form-group">
			      <label for="campo2">Serviço:</label>
			      <select id="servico" name="servico">
 						<c:forEach var="servico" items="${listaServicos}">
 							<option>${servico.nome}</option>
 						</c:forEach>
			      </select>
			    </div>
			    
			    <div class="form-group">
			      	<label for="campo3">Data do Atendimento:</label>
			        <input type="date" class="form-control" id="data" name="data">
			    </div>
			    
			    <div class="form-group">
			      <label for="campo3">Horário do Atendimento:</label>
			      <input type="text" class="form-control" id="hora" name="hora">
			    </div>

				<div class="form-group">
			      <label for="campo3">Status:</label>
			      <select id="status" name="status">
					<option value="Agendado">Agendado</option>
					<option value="Cancelado">Cancelado</option>
					<option value="Realizado">Realizado</option>
				  </select>
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


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
	   <link rel="stylesheet" href="css/style.css">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css">     
    </head>
	<body>
		<c:import url="/inc/header.jsp"/>
	
		<!-- Conteúdo principal da página -->
		<main class="container">
		<h1>Gerenciar Quadro de Funcionários</h1>
		<hr/>
			<form action="#" method="post">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
					<div class="col-md-4"></div>
				</div>
			
			    <div class="form-group">
				    <div class="row">
						<div class="col-md-4">
							<label for="campo1" class="col-sm-2 col-form-label">Filtro:</label>
		    				<select class="form-control" id="idFuncao" name="idFuncao" style="width:250px;">
		    					<option value="">Função</option>
			    				<c:forEach var="funcao" items="${listaFuncao}">
			    					<option value="${funcao.id}">${funcao.nomeCompleto}</option>
			    				</c:forEach>
			    			</select>
						</div>
						<div class="col-md-2">
							<div class="form-group">
							    <select class="form-control" id="idCliente" name="idCliente" style="width:125px;">
						    		<option value="">Estado</option>
									<option value="AC">AC</option>
									<option value="AL">AL</option>
									<option value="AM">AM</option>
									<option value="AP">AP</option>
									<option value="BA">BA</option>
									<option value="CE">CE</option>
									<option value="DF">DF</option>
									<option value="ES">ES</option>
									<option value="GO">GO</option>
									<option value="MA">MA</option>
									<option value="MG">MG</option>
									<option value="MS">MS</option>
									<option value="MT">MT</option>
									<option value="PA">PA</option>
									<option value="PB">PB</option>
									<option value="PE">PE</option>
									<option value="PI">PI</option>
									<option value="PR">PR</option>
									<option value="RJ">RJ</option>
									<option value="RN">RN</option>
									<option value="RS">RS</option>
									<option value="RO">RO</option>
									<option value="RR">RR</option>
									<option value="SC">SC</option>
									<option value="SE">SE</option>
									<option value="SP">SP</option>
									<option value="TO">TO</option>
							    </select>
							</div>
						</div>
						<div class="col-md-4">
							 <!-- <label for="campo2">Cidade:</label> -->
							 <label for="campo2" class="col-sm-3 col-form-label">Cidade:</label>
			   				 <input type="text" class="form-control" id="cidade" name="cidade" style="width: 50%">
						</div>
						<div class="col-md-2">
							<!-- Fututo submit aqui -->
							<button type="button" class="btn btn-default">
			      				<span class="glyphicon glyphicon-search"></span>Pesquisar
			    			</button>
						</div>
					</div>
			    </div>		    
	
				  <div class="table-responsive">          
				  <table class="table">
				    <thead>
				      <tr>
				        <th>ID</th>
				        <th>Nome</th>
				        <th>CPF</th>
				        <th>Email</th>
				        <th>Limite Crédito</th>
				      </tr>
				    </thead>
				    <tbody>
				    <c:forEach var="cliente" items="${listaFuncao}">
				      <tr>
				        <td>${cliente.id}</td>
				        <td>${cliente.nomeCompleto}</td>
				        <td>${cliente.cpf}</td>
				        <td>${cliente.email}</td>
				        <td>${cliente.limiteCredito}</td>
				        <!-- Possível botão para puxar dados do funcionário -->
				      </tr>
				      </c:forEach>
				    </tbody>
				  </table>
				  </div>
	
			    <div class="form-group">
			      <label for="campo3">Limite Crédito:</label>
			      <input type="text" class="form-control" name="limiteCredito">
			    </div>

			  
			  <div id="actions" class="row">
			    <div class="col-md-12">
			      <button type="submit" class="btn btn-primary">Salvar</button>
			      <a href="/MyCRM/index.jsp" class="btn btn-default">Cancelar</a>
			    </div>
			  </div>
			</form>
		</main>
		
		<c:import url="/inc/footer.jsp"/>
	</body>
</html>
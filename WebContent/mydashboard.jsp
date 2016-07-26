<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% 
    	HttpSession objSession= request.getSession(true);
    	Object username= objSession.getAttribute("_username") == null ?  null : objSession.getAttribute("_username");
    	
    	
    %>
    
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
				<link rel="stylesheet" type="text/css" href="css/myfcc.css">
				<title>MyFitnessCompannion:Dash-board</title>
			</head>
			<body>
				<%
						if(username != null){login.jspajax.contralador.ControladorUsuario ctrlUsr= 
											 	new login.jspajax.contralador.ControladorUsuario();
											 login.jspajax.include.Usuario usr= 
											 	new login.jspajax.include.Usuario(username.toString());
											}
						else{response.getWriter().println("Por favor inicie sesion");
							 response.sendRedirect("log-in.jsp");}
				%>
  									 <div class="container">
						<div class="row">
							<div class="col-xs-12"></div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="jumbotron well" id="fcc-jumbo-panne">
  									<h1 class="myfcc-jumbo-h1" id="activate-h1"> Welcome to your Dash board <%= username.toString() %></h1>
  									 <p class="myfcc-jumbo-p">The Log- In process was successfully carried, in this area "My Dash Board" youll find the access to all resources</p>
  									 <form name="log-out" action="doLogOut" class="fcc-form" method="POST">
											<button class="btn btn-default btn-block" type="submit">Log Out</button>
										</form>
  								</div>
							</div>
						</div>
					</div>
				<script src="js/jquery-1.11.3.js"></script>
				<script src="js/bootstrap.min.js"></script>
				<script src="js/myfcc-js.js"></script>
			</body>
		</html>
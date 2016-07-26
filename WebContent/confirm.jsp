<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
				<title>Wating for confirmation</title>
			
				<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
				<link rel="stylesheet" type="text/css" href="css/myfcc.css">
			</head>
			<body>
					<div class="container">
						<div class="row">
							<div class="col-xs-12"></div>
						</div>
						<div class="row">
							<div class="col-xs-12">
								<div class="jumbotron well" id="fcc-jumbo-panne">
  									<h1 class="myfcc-jumbo-h1" id="activate-h1">Activate your account</h1>
  									 <p class="myfcc-jumbo-p">The registration process was successful, we have sent a e-mail to your registered email address containing the activation code, please retrieve code and paste it in te verification box or follow the activation link within the email body</p>
  									 <h2 class="myfcc-jumbo-h2">You did not get the code?</h2>
  									 <p class="myfcc-jumbo-p">Some times the message takes up to 5 minutes depending on the network status, would you like us to send the code again?  <a class="btn btn-default href="confirm.jsp" role="button">Re Send Code</a></p>
  									 <p>
	  									<form name="verification-code" action="" class="fcc-form" method="POST">
												<div class="form-group">
													<input type="text" class="form-control" placeholder="Verification Code" name="vcode" required autofocus>
												</div>
												<button class="btn btn-default btn-block" type="submit">Activate</button>
										</form>
  								   </p>
								</div>
							</div>
						</div>
					</div>
				<script src="js/jquery-1.11.3.js"></script>
				<script src="js/bootstrap.min.js"></script>
			</body>
		</html>
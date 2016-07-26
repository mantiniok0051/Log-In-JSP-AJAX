package login.jspajax.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.jspajax.contralador.ControladorUsuario;
import login.jspajax.include.Usuario;

@WebServlet("/doSignUp")
public class CrearUsuario extends HttpServlet {
	
	public CrearUsuario() {super(); }

	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		
		String _username= request.getParameter("_username");
		String _email=    request.getParameter("_email");
		String _userpass= request.getParameter("_userpass");
		
		Usuario usr = new Usuario(_username, _email, _userpass);
		ControladorUsuario ctrlUsr= new ControladorUsuario();
		
		if (ctrlUsr.create(usr)) {response.getWriter().print("1");}
		else{ response.getWriter().print("0");}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
//Values
	private static final long serialVersionUID = 1L;
}

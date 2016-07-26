package login.jspajax.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.jspajax.contralador.ControladorUsuario;
import login.jspajax.include.Usuario;

@WebServlet("/doLogIn")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Autenticar() {
        super();}

	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=UTF-8"); 
		
		String _username= request.getParameter("_username");
		String _userpass= request.getParameter("_userpass");
		
		Usuario usr= new Usuario(_username, _userpass);
		ControladorUsuario ctrlUsr= new ControladorUsuario();
		
		if (ctrlUsr.validate(usr)) {response.getWriter().print("1");
									HttpSession session= request.getSession(true);
									session.setAttribute("_username", _username);}
		else{response.getWriter().print("0");}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
	}

}

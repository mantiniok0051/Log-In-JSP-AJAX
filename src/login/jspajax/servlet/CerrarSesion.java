package login.jspajax.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/doLogOut")
public class CerrarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public CerrarSesion() {
        super();}

	
	@SuppressWarnings("deprecation")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession sesion= request.getSession(true);
		sesion.removeValue("username");
		response.sendRedirect("log-in.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}

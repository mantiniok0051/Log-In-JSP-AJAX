package login.jspajax.contralador;

import login.jspajax.include.Usuario;
import login.jspajax.modelo.ModeloUsuario;

public class ControladorUsuario {
	
	
	
	public boolean create(Usuario usr){
		
		ModeloUsuario mdlUsr= new ModeloUsuario();
		
		return mdlUsr.registrarUsuario(usr);
	}

	public boolean validate(Usuario usr){
		ModeloUsuario mdlUsr= new ModeloUsuario();
		return mdlUsr.login(usr);
	}

	public String getViewUser(Usuario usr){
		
		String htmlCode="";
		htmlCode += "<h2>Bienvenido "+ usr.getUser_name()+" !!";
		htmlCode += "<div><a href='doLogOut'>Cerrar Sesion</><div>";
		
		return htmlCode;
	}
}


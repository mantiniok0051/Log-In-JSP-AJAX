package login.jspajax.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import login.jspajax.include.Encriptar;
import login.jspajax.include.Usuario;

public class ModeloUsuario extends ModeloConexion {
	
	public boolean registrarUsuario(Usuario usr){
		
		boolean flag= false;
		
		PreparedStatement pst= null;
		
		try {String sql= "call newUser(?,?,?,?)";
			 pst= getConnection().prepareStatement(sql);
			 pst.setString(1, usr.getUser_name());
			 pst.setString(2, usr.getEmail());
			 pst.setString(3, Encriptar.sha1(usr.getUser_pass()));
			 pst.setString(4, usr.getLast_session());
			 
			 if (pst.executeUpdate() == 1) { flag= true;}
			 
			 }
		catch (Exception e) {System.err.println("Un error se a presentado durante el proceso");
							 System.err.println(e.getMessage());}
		finally { 
					try {
							if (getConnection() != null) {getConnection().close();}
							if (pst != null ) {pst.close();}
						} 
					catch (Exception e2) {System.err.println(e2.getMessage());}
				}
		return flag;
	}
	
	public boolean login(Usuario usr)
	{
		boolean flag= false;
		PreparedStatement pst =null;
		ResultSet rs= null;
		
		try {
				String sql= "call login(?,?)";
				pst= getConnection().prepareStatement(sql);
				pst.setString(1, usr.getUser_name());
				pst.setString(2, Encriptar.sha1(usr.getUser_pass()));
				rs= pst.executeQuery();
				
				if (rs.absolute(1)) {flag= true;}
						
			}
		catch (Exception e) {System.err.println(e.getMessage());}
		
		finally {
					try {
							if (getConnection() != null) {getConnection().close();}
							if (pst != null) {pst.close();}
							if (rs != null) {rs.close();}
						} 
					catch (Exception e2) {System.err.println(e2.getMessage());}
				}
		
		return flag;
	}

}

package login.jspajax.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ModeloConexion {

	
	public ModeloConexion(){
		try {Class.forName(JClassName);
			 dbLink= DriverManager.getConnection(URL, dbUserName, dbPassword );
			} 
		catch (Exception e) {System.err.println(e.getMessage());}
	}
	
	public Connection getConnection(){return this.dbLink;}
	
	
	//Connection Assets
		private String dbUserName= "tomcat";
		private String dbPassword= "tomcat";
		private String dbHostName= "localhost";
		private String dbHostPort= "3306";
		private String dbSchemaID= "log-in-jsp-ajax";
		private String JClassName= "com.mysql.jdbc.Driver";
		private String URL= "jdbc:mysql://"+dbHostName+":"+dbHostPort+"/"+dbSchemaID;
		private Connection dbLink;
}

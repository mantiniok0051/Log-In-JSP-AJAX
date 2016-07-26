package login.jspajax.include;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
	
	
	public Usuario (String user_name){this.user_name = user_name;}
	
	public Usuario(String user_name, String email, String user_pass) {
		super();
		this.user_name = user_name;
		this.email = email;
		this.user_pass = user_pass;
		Date d= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		this.last_session = sdf.format(d);
	}
	
	public Usuario (String user_name, String user_pass){
		super();
		this.user_name = user_name;
		this.user_pass = user_pass;
	}
	
	public String getUser_name() {return user_name;}
	public void setUser_name(String user_name) {this.user_name = user_name;}

	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	
	public String getUser_pass() {return user_pass;}
	public void setUser_pass(String user_pass) {this.user_pass = user_pass;}
	
	public String getLast_session() {return last_session;}
	public void setLast_session(String last_session) {this.last_session = last_session;}
	
//Values	
	private String user_name;
	private String email;
	private String user_pass;
	private String last_session;
	

}

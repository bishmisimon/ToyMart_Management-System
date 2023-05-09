package Selling;

public class SignIn {
	
	
	private String userD;
	private String pass;

	public SignIn(String userD,String pass) {
		
		this.userD=userD;
		this.pass=pass;
	}
	
	
	
	public void setuserD(String userD) {
		this.userD = userD;
		
	}
	
	public String getuserD() {
		return userD;
	}
	
	
	
	public void setpass(String pass) {
		pass = pass;
	}
	
	public String getpass() {
		return pass;
	}
	
	



}

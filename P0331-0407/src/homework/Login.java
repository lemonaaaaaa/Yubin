package homework;

public class Login {
	private String identify; // 아이디
	private String pass; // 비밀번호
	
	
	public Login(String identify, String pass) {
		super();
		this.identify = identify;
		this.pass = pass;
		
		
	}
	public String getIdentify() {
		return identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Login [ID =" + identify //
				+ ", PW =" + pass //
				+ "]";
	}
	
	
	
	
	
}

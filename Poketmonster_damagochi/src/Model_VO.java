
public class Model_VO {
	private String id;
	private String pw;
	private String nick;
	
	public Model_VO(String id, String pw, String nick) {
		this.id=id;
		this.pw=pw;
		this.nick=nick;
	}
	
	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String getId() {
		return id;
	}

	
}



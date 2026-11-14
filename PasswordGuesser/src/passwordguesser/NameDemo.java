package passwordguesser;

public class NameDemo {
	private String password;
	
	public NameDemo(String p) {
		this.password = p;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public static void main(String[] args) {
		String password = "moneyase";
        NameDemo demo = new NameDemo(password);
        PasswordGuesser.guessPassword(demo.getPassword());

		
		
		
	}
}

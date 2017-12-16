
public class CredentialsInput {
	
	private String username;
	private String password;
	private String passwordConfirmation;
	private String email;
	
	public boolean validateUsername() { return false; }
	public boolean validatePassword() { return false; }
	public boolean validateEmail() { return false; }
	public boolean matchConfirmation() { return false; }
	public void sendInput() {}
	public void setCredentials() {}
	

}

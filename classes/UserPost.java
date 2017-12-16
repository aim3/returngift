import java.sql.Time;

public class UserPost {

	private int postID;
	private String username;
	private Time time;
	private String text;
	private int voteCount;
	
	public boolean validateText() { return false; }
	public void deletePost() {}
	public void sendPost() {}
	public String createPost() { return null; }
	

}

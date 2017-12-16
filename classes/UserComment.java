import java.sql.Time;

public class UserComment {
	
	private int commentID;
	private UserPost parentPost;
	private int threadPosition;
	private String username;
	private Time time;
	private String text;
	private int voteCount;
	
	public boolean validateText() { return false; }
	public void deleteComment() {}
	public void sendComment() {}
	public String createComment() { return null; }

}

package returngift;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Feedback {

	private String text;
	private int rating;

	public Feedback(String text, String rating) {
		this.text = text;
		this.rating = Integer.parseInt(rating);
	}

	public void sendMail() {

		String host = "smtp.mail.com";
		final String user = "frankiezee@null.net"; //a mail.com email address
		final String password = "=~@N]Py{nTS!5XLD"; //the email address's password

		String to = "returngift@protonmail.com";

		// Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");
		//props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", 587);

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		// Compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Return Gift Feedback");
			message.setText(text + "\n Rating: " + rating);

			// Send the message
			Transport.send(message);

			//System.out.println("message sent successfully...");

		} catch (MessagingException e) {
			
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			AppUI.feedbacktextarea.setText(exceptionAsString);
			
			//AppUI.feedbacktextarea.setText("Please send all inquiries to: returngift@protonmail.com.");
		}
	}

}

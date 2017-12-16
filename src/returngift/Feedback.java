package returngift;

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
		  
		  String host="smtp.mail.com";  
		  final String user="frankiezee@null.net";//change accordingly  
		  final String password="zleefp54!A";//change accordingly  
		    
		  String to="returngift@protonmail.com";//change accordingly  
		  
		   //Get the session object  
		   Properties props = new Properties();  
		   props.put("mail.smtp.host", host);  
		   props.put("mail.smtp.auth", "true"); 
		   props.put("mail.smtp.port", 587);
		     
		   Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {  
		      protected PasswordAuthentication getPasswordAuthentication() {  
		    return new PasswordAuthentication(user, password);  
		      }  
		    });  
		  
		   //Compose the message  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setSubject("javatpoint");  
		     message.setText(text + "\n Rating: " + rating);  
		       
		    //send the message  
		     Transport.send(message);  
		  
		     System.out.println("message sent successfully...");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}  
		 }  

}

package appModules;


import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import org.testng.annotations.Test;

import java.util.*;


public class mailtrap {
//http://selenium2advanced.blogspot.com/2012/01/email-using-java-api.html


	public class SendMailUsingAuthentication
	{

	  private static final String SMTP_HOST_NAME = "smtp.mailtrap.io";
	  private static final String SMTP_AUTH_USER = "787c0f9fb85dd0";
	  private static final String SMTP_AUTH_PWD  = "70ff7487ee0d5d";
	  private static final String emailMsgTxt      = "";
	  private static final String emailSubjectTxt  = "";
	  private static final String emailFromAddress = "noreply@charityq.com";
	  private final String[] emailList = {"Luser@lays.com","busern1@cq.com"};
	  private BodyPart messageBodyPart;
      
	  @Test
	  public void run() throws Exception
	  {
	    SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
	    smtpMailSender.postMail( emailList, emailSubjectTxt, emailMsgTxt, emailFromAddress);
	    System.out.println("Sucessfully Sent mail to All Users");
	  }


	  public void postMail( String recipients[ ], String subject,
	                            String message , String from) throws MessagingException
	  {
	    boolean debug = false;

	     //Set the host smtp address
	     Properties props = new Properties();
	     props.put("mail.smtp.host", SMTP_HOST_NAME);
	     props.put("mail.smtp.auth", "true");

	    Authenticator auth = new SMTPAuthenticator();
	    Session session = Session.getDefaultInstance(props, auth);

	    session.setDebug(debug);

	    // create a message
	    Message msg = new MimeMessage(session);

	    // set the from and to address
	    InternetAddress addressFrom = new InternetAddress(from);
	    msg.setFrom(addressFrom);
	  
	    // new code added
	  Multipart multipart = new MimeMultipart();
	 // multipart.addBodyPart(messageBodyPart);

	    // Part two is attachment
	    messageBodyPart = new MimeBodyPart();
	    String filename = "C:\\Documents and Settings\\Administrator\\My Documents\\images.jpg";
	    DataSource source = new FileDataSource(filename);
	    messageBodyPart.setDataHandler(new DataHandler(source));
	    
	    messageBodyPart.setFileName("Attachment Here:");
	    messageBodyPart.setDescription(message);
	    multipart.addBodyPart(messageBodyPart);

	    // Put parts in message
	   msg.setContent(multipart);

	    InternetAddress[] addressTo = new InternetAddress[recipients.length];
	    for (int i = 0; i < recipients.length; i++)
	    {
	        addressTo[i] = new InternetAddress(recipients[i]);
	    }
	    msg.setRecipients(Message.RecipientType.TO, addressTo); 

	  // Setting the Subject and Content Type
	msg.setSubject(subject);
	    msg.setContent(multipart);
	      Transport.send(msg);
	 }

    @Test(enabled=false, priority=2)
	private class SMTPAuthenticator extends javax.mail.Authenticator
	{

	    public PasswordAuthentication getPasswordAuthentication()
	    {
	        String username = SMTP_AUTH_USER;
	        String password = SMTP_AUTH_PWD;
	        return new PasswordAuthentication(username, password);
	    }
	}

	}

}

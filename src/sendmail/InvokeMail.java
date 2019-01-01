package sendmail;

import javax.mail.MessagingException;

public class InvokeMail {

	public static void main(String[] args) throws MessagingException {
		String to[] = {"ganesh.chaudhari@aqmtechnologies.com"};
	    
	    SendMail.send("ganesh.chaudhari@aqmtechnologies.com", to, "JUnit Report", "Check the PDF attachment.");

	}

}

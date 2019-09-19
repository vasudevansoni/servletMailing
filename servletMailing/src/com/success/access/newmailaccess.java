package com.success.access;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class newmailaccess {
	String host = "smtp.gmail.com";

	public void sendMail(String fromEmail, String username, String password, String toEmail, String toSubject,
			String toMessage) {

		try {
			Properties props = System.getProperties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.fallback", "false");

			Session mailSession = Session.getDefaultInstance(props, null);
			mailSession.setDebug(true);

			Message mailMessage = new MimeMessage(mailSession);
			mailMessage.setFrom(new InternetAddress(fromEmail));
			mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			mailMessage.setContent(toMessage, "text/html");
			mailMessage.setSubject(toSubject);

			Transport transport = mailSession.getTransport("smtp");
			transport.connect(host, username, password);

			transport.sendMessage(mailMessage, mailMessage.getAllRecipients());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.success.mailing;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.success.access.newmailaccess;

@WebServlet("/forEnquiry")
public class forEnquiry extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*
	@EJB
	private mail newMail;
	*/
	private newmailaccess mail;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
		String toEmail = request.getParameter("toEmail");
		String toSubject = request.getParameter("toSubject");
		String toMessage = request.getParameter("toMessage");

		String fromEmail = "successbags09@gmail.com";
		String username = "successbags09";
		String password = "SuccessBags@123456";

		PrintWriter out = response.getWriter();

		try {
			
			//newMail.sendMail(fromEmail, username, password, toEmail, toSubject, toMessage);

			mail.sendMail(fromEmail, username, password, toEmail, toSubject, toMessage);
			
			out.println("<html><head><title>Mail Status</title></head><body>");
			out.println("<h1>Mail Status !!!</h1>");
			out.println("<h3>Mail Sent Successfully</h3>");
			out.println("Go Back <a href='simplesendingmailform.jsp'>Click Here</a>");
			out.println("</body></html>");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

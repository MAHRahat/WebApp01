package myclasses;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class success extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Success</title>");
			out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/msg.css\">");
			out.println("<script src=\"js/msg.js\"></script>\n");
			out.println("</head>");
			out.println("<body style=\"color: green;\" onload=\"init(true);\">\n"
					+ "<canvas id=\"emocanvas\" width=\"300\" height=\"300\"></canvas>\n"
					+ "<br><h1>Login successfull!!</h1></br>"
					+ "</body>\n"
					+ "");
			out.println("</html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

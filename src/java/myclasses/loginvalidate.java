package myclasses;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginvalidate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String dbUrl = null;
		String dbUsr = null;
		String dbPass = null;
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String strEmail = null;
		String strPass = null;
		Boolean succed = null;
		strEmail = request.getParameter("email");
		strPass = request.getParameter("pass");
		try (PrintWriter out = response.getWriter()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(dbUrl, dbUsr, dbPass);
				st = conn.createStatement();
				rs = st.executeQuery("select * from userdb where email = '" + strEmail + "' and pass = '" + strPass + "'");
				if (rs.next()) {
					response.sendRedirect("success");
				} else {
					response.sendRedirect("error");
				}
			} catch (Exception e) {
				succed = false;
			}
			if (!succed)
			{
				response.sendRedirect("error");
			}
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet loginvalidate</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet loginvalidate at " + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}
}

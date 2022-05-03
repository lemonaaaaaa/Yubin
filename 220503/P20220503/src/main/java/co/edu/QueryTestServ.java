package co.edu;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest2")
public class QueryTestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QueryTestServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.getHeaderNames();
	      Enumeration<String> enu = request.getHeaderNames();
	      while(enu.hasMoreElements()) {
	         String str = enu.nextElement();
	         System.out.println(request.getHeader(str));
	      }
	}

}

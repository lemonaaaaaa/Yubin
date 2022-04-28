package co.edu.student;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/DelStudentServlet")
public class DelStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DelStudentServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("derId");
		StudentDAO dao = new StudentDAO();
		boolean success = dao.removeStudent(id);

		if (success) {
			resp.getWriter().println("{\"rerCode\":\"OK\", \"retVal\"");
		}
	}

}

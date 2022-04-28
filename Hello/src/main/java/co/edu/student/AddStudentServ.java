package co.edu.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/addStudentServlet")
public class AddStudentServ extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");

		String studentNo = req.getParameter("sno");
		String studentName = req.getParameter("sname");
		String engScore = req.getParameter("eScore");
		String korScore = req.getParameter("kScore");

		Student stud = new Student();
		stud.setStudentNo(Integer.parseInt(studentNo));
		stud.setStudentName(studentName);
		stud.setEngScore(Integer.parseInt(engScore));
		stud.setKorScore(Integer.parseInt(korScore));

		// db insert.
		StudentDAO dao = new StudentDAO();
		boolean success = dao.addStudent(stud);
		if (success) {
			// {"retCode": "Success,  "StudNo":studenNo, "StudName":"StudentName", "engScore":engScore, "korScore":korScore}
			resp.getWriter().println("{\return('성공')");
		
		} else {
			// {"retCode": "Fail"}
			resp.getWriter().println("<script>alert('실패');</script>");
		}

	}
}

package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/StudentGetServlet")
public class StudentGetServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public StudentGetServlet() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // GET방식 : cmd=search, cmd=null일경우 -> JSON형태로 반환
      response.setContentType("text/html;charset=utf-8");
      response.setCharacterEncoding("utf-8");
      request.setCharacterEncoding("utf-8");
      String cmd = request.getParameter("cmd");
      
      if (cmd != null && cmd.equals("search")) { // not null 필요
         String id = request.getParameter("user_id");
         
         // id로 검색해서 한 건 조회하는 기능
         StudentDAO dao = new StudentDAO();
         Student student = dao.searchStudent(id);
         if(student !=null) {
         response.getWriter().println("<h3>학생번호: " + student.getStudentNo() + "</h3>");
         response.getWriter().println("<h3>이름: " + student.getStudentName() + "</h3>");
         response.getWriter().println("<h3>영어: " + student.getEngScore() + "</h3>");
         response.getWriter().println("<h3>국어: " + student.getKorScore() + "</h3>");
         }
      } else if (cmd != null && cmd.equals("list")) {
         StudentDAO dao = new StudentDAO();
         Student stud = new Student();
         String id = request.getParameter("user_id");
         String name = request.getParameter("user_name");
         
         stud.setStudentNo(Integer.parseInt(id));
         stud.setStudentName(name);
         
         dao.addStudent(stud);
         
         response.getWriter().print("입력성공");
         
      } else {
         
         response.setContentType("text/json;charset=utf-8"); // text파일이 json 포맷입니다
         StudentDAO dao = new StudentDAO();
         List<Student> list = dao.studentList();
         // [{},{},{}]
         Gson gson = new GsonBuilder().create();
         response.getWriter().print(gson.toJson(list)); // list를 gson이라는 오브젝트가 갖고있는 toJson의 매개값으로
      }
      
   }
   // ajax 활용할것..?

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      
      // 한글처리
      request.setCharacterEncoding("utf-8");
      response.setCharacterEncoding("utf-8");
      response.setContentType("text/html;charset=utf-8");
      
      String cmd = request.getParameter("cmd");
      if (cmd != null && cmd.equals("add")) { // 입력
         
         StudentDAO dao = new StudentDAO();
         Student stud = new Student();
         
         String id = request.getParameter("user_id");
         String name = request.getParameter("user_name");
         String eng = request.getParameter("eng_score");
         String kor = request.getParameter("kor_score");
      
         stud.setStudentNo(Integer.parseInt(id));
         stud.setStudentName(name);
         stud.setEngScore(Integer.parseInt(eng));
         stud.setKorScore(Integer.parseInt(kor));
         
         dao.addStudent(stud);
         
         response.getWriter().print("입력성공");
      }else if (cmd != null && cmd.equals("del") ) {
    	  String id = request.getParameter("user_id");
    	  
    	  StudentDAO dao = new StudentDAO();
    	  if(dao.removeStudent(id)) {
    		  response.getWriter().print("<script>alter('삭제성공')</script>");
    		  
    	  }else {
    		  response.getWriter().print("<script>alter('삭제실패')</script>");
    		  
    	  }
    	  
      }else if (cmd != null && cmd.equals("mod")) {
    	  String id = request.getParameter("user_id");
          String name = request.getParameter("user_name");
          String eng = request.getParameter("eng_score");
          String kor = request.getParameter("kor_score"); 
          
          Student stud = new Student();
       
 
          
    	  
      }
      response.sendRedirect("studentList.jsp");
   }
   
   //회원삭제
   if(cmd = != && cmd. equals(''))
   
   long id = request.getParameter("user_id");
   String name = request.getParameter("user_name");
   String eng = request.getParameter("eng_score");
   String kor = request.getParameter("kor_score");

}
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>반갑습니다</h3>
<%
  //자바 코드
  String name = "박현우";
  out.println("<h3>" + name + "</h3>"); 
  
 String id =  request.getParameter("user_id");
 String name2 = request.getParameter("user_name");
 out.println("<h4> 입력값: " + id + ", name: + name2 " + "<h4>" ); 
 %> 
 
 <a href="./student/student.do">Student Servlet</a>;
</body>
</html> 
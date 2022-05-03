
<%@page import="co.edu.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response.jsp</title>
</head>
<body>
	<%
		String id = (String) request.getAttribute("id"); //(String)를 적은 이유는 리턴 타입이 오브젝트 타입이라서 스트링으로 바꿔줬음
		String name = (String) request.getAttribute("name"); //<%=id % >> 자바 영역에서 id 값을 가져오겠다.
		Student student = (Student) request.getAttribute("result");
	%>
	
	<h3>id: <%=id %></h3> 
	<h3>name: <%=name %></h3> 
	<h3>no: <%=student.getStudentNo() %></h3>
	<h3>name: <%=student.getStudentName() %></h3>
	
</body>
</html>
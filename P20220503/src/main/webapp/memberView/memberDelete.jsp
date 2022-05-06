<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberDeleteContol</title>
</head>
<body>
${error }
	<h3>회원정보삭제</h3>
	<form action=${pageContext.servletContext.contextPath}/memberSearch.do/memberSearch.do method="get">
	조회 아이디: <input type="text" name="id"><br>
	<input type="hidden" name="job" value="delete">
	<input type="submit" value="search">
	</form>


</body>
</html>
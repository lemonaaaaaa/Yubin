<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookRemoveOutput.jsp</title>
</head>
<body>

	<h3>삭제결과페이지</h3>
	<h3>${bookTitle }의 정보가 삭제되었습니다.</h3>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>
</html>
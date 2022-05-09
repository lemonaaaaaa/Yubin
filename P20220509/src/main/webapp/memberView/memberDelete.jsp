<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberView/memberDelete.jsp</title>
</head>
<body>
	${error}
	<h3>회원삭제검색</h3>
	<form
		action="${pageContext.servletContext.contextPath}/memberSearch.do"
		method="get">
		조회 아이디: <input type="text" name="id"><br> <input
			type="hidden" name="job" value="delete"> <input type="submit"
			value="Search">
	</form>
	<br>
	<c:choose>
		<c:when test="${!empty result}">
			<h3>${result}}</h3>
		</c:when>c:when>
	<c:otherwise>
			<h3>회원정보삭제</h3>
			<form
				action="${pageContext.servletContext.contextPath }/memderDelete.do"
				method="post">
				아이디 : <input type="text" name="id" readonly value="${member.id }"><br>
				이름 : <input type="text" name="name" value="${member.name}"><br>
				이메일 : <input type="text" name="email" value="${member.email}"><br>
				비밀번호 : <input type="text" name="passwd" value="${member.passwd}"><br>
				<input type="submit" value="삭제">
			</form>
		</c:otherwise>
	</c:choose>
	<jsp:include page="home.jsp"></jsp:include>
</body>
</html>
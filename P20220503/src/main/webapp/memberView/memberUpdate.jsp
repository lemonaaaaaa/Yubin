<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberUpdateControl</title>
</head>
<body>
	${error }
	<h3>회원정보수정</h3>
	<form action="${pageContext.servletContext.contextPath}/memberSearch.do" method="get">
		조회 아이디: <input type="text" name="id"><br>
		<input type="hidden" name="job" value="update"> 
		<input type="submit" value="search">
	</form>
	
	<c:choose>
	  <c:when test="">
	  </c:when>
	  <c:otherwise>
    	<form action="${pageContext.servletContext.contextPath }/memberUpdate.do" method="post">
          아이디:<input type="text" name="id" readonly value="${member.id}"><br>
	      이름:<input type="text" name="name" value="${member.name}"><br>
	      이메일:<input type="text" name="email" value="${member.email}"><br>
          비밀번호:<input type="text" name="passwd" value="${member.passwd}"><br>
          <input type="submit" value="update">
	    </form>
	  </c:otherwise>
	</c:choose>
	<jsp:include page="home.jsp"></jsp:include>
</body>
</html>
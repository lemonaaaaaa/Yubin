<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>도서삭제조회</h3>
    <form action="../searchBook.do" method="get">
        <input type="text" name="bookCode" id=""><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="조회">
    </form><br>

    <!-- 도서삭제를 위한 화면 작성코드를 입력하세요. -->
    <c:choose>
    <c:when test="${!empty result }"><h3>${result }</h3></c:when>
    <c:otherwise>
    <h3>도서삭제</h3>
    <form action="${pageContext.servletContext.contextPath }/bookDelete.do" method="post">
    도서코드: <input type ="text" name ="bookCode" readonly value="${book.bookCode }"><br>
    도서제목: <input type ="text" name ="bookTitle" value="${book.bookTitle }"><br>
    도서작가: <input type ="text" name ="bookAuthor" value="${book.bookAuthor }"><br>
    도서출판: <input type ="text" name ="bookpress" value="${book.bookPress }"><br>
    도서가격: <input type ="text" name ="bookprice" value="${book.bookPrice }"><br>
    <input type="submit" value="삭제">
    </form>
    </c:otherwise>
    </c:choose>
   

    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>
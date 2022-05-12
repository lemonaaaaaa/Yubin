<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인기능</h3>
<form action="../memberLogin.do" method="post">
아이디 : <input type="text" name ="id"><br>
비밀번호: <input type="text" name="passwd">
<input type="submit" value="로그인">

</form>
<br>
<a href="./MemberInsert.html">회원가입</a>

 
				if (result == 1) {
					System.out.println("로그인 되었습니다");
					loginId = id;

				} else if (result == 0) {
					System.out.println("로그인 실패.");
					continue;
				}
</body>
</html>
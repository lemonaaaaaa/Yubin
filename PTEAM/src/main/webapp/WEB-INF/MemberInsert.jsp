<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberInsert.jsp</title>
</head>
<body>
<h3>회원가입</h3>
<form action="../memberInsert.do" method="post" enctype="multipart/form=data">
아이디 : <input type="text" name ="id"><br>
비밀번호: <input type="text" name="passwd"><br>
이메일 : <input type="text" name="email"><br>
닉네임 : <input type="text" name="nick">
</form>
</body>
</html> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
   <form name="frm" action="StudentGetServlet" method="get"> <!-- 비공개로 넘기기 위해 post방식 -->
      <input type="hidden" name="cmd" value="search">
      ID: <input type="number" name="user_id"><br>
      Name: <input type="text" name="user_name"><br>
      Eng: <input type="number" name="eng_score"><br>
      Kor: <input type="number" name="kor_score"><br>
      <input type="submit" value="조회"> <!-- 조회만 get방식 -->
      <input id="addBtn" type="button" value="입력">
      <input id="modBtn" type="button" value="수정">
      <input id="delBtn" type="button" value="삭제">
   </form>
	<a href='./studentList.jsp'>목록이동</a>
   <script>
   let modBtn =document.getElementById('modBtn');
   del btn =addEventListener('click',function() {
	    let frm = document.forms.frm;
	    frm.action = "StudentGetServlet";
   
   
   
   
   let derBtn = document.querySelector('#addBtn');
   del btn =addEventListener('click',function() {
	    let frm = document.forms.frm;
	    frm.action = "StudentGetServlet";// document의 forms 태그들을 컬렉션 형태로 다 가져옴. 그 중 frm
    frm.action = "StudentGetServlet";
         frm.method = "post";
         frm.cmd.value = "add";
         });
   
      let btn = document.querySelector('#addBtn'); // 태그 찾아서 click이벤트를 달기 위함
      btn.addEventListener('click', function() {
          
         
        
         frm.submit(); // form의 submit(버튼누르면 submit됐던것과 같은 기능) 함수 실행
      });
   </script>
</body>
</html>
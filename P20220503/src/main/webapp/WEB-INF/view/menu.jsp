<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면입니다.</title>
</head>
<body>
	<h3>첫페이지입니다.</h3>
		<!-- Sidebar-->
            <div class="border-end bg-white" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light">Start Bootstrap</div>
                <div class="list-group list-group-flush">
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberView/memberInsert.tiles">회원정보입력</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberView/memberSearch.tiles">회원정보검색</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberView/memberUpdate.tiles">회원정보수정</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberView/memberDelete.tiles">회원정보삭제</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/memberList.do">전체목록조회</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="${pageContext.request.contextPath }/ajax.html">ajax</a>
                </div>
            </div>
            
            
</body>
</html>
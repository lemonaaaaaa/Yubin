<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>
</head>
<body>
	<script>
		//Asynchronous Javascript And Xml.
		let url = 'StudentGetServlet';
		fetch(url)
			.then(result => {
				return result.json(); //{"id:23, "name:"hong"}
			})
			.then(result => {
				console.log(result);
			})//정상실행시
			.catch(error => {
				console.lor(error);
			})//실패시
	</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="n" items="${list}">
	 이름 : ${n.name}, 나이 : ${n.age}
	 안녕하세요
	 수정합니다123. - 안태민
	 아아아 마이크테스트 하나둘 - 안태민
	 skalsduq@naver.com skalsduqWkd1
	 
	 수정연습 - 최민재
	</c:forEach>
</body>
</html>
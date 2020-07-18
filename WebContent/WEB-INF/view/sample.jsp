<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./sampleTest" method="post">
<input type="text" name="param">
<input type="submit" value="登録">
</form>
<%= request.getAttribute("param")%>
</body>
</html>
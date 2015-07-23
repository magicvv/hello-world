<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>user test</title>
</head>
<body>
	<sf:form method="GET" action="/user/">
		姓名： <sf:input path="name" /><br/>
		年龄： <sf:input path="age" /><br/>
		性别： <sf:input path="sex" /><br/>
		<input type="submit" value="submit" />
	</sf:form>
</body>
</html>
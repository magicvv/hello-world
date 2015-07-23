<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>user test</title>
</head>
<body>
	<form name="mainform" method="POST" action="<%= request.getContextPath()%>/user/add">
		工号： <input type="text" id="id" name="id" /><br/>
		姓名： <input type="text" id="name" name="name" /><br/>
		年龄： <input type="text" id="age" name="age" /><br/>
		性别： <input type="text" id="sex" name="sex" /><br/>
		<input type="submit" value="submit" />
	</form>
</body>
</html>
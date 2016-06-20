<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<body>


		This is my JSP page.
		<br>
		<form action="web/upload" enctype="multipart/form-data" method="post">
			userToken：
			<input type="text" name="userToken">
			<br/>
			userUid:
			<input type="text" name="userUid">
			<br />
			optType：
			<input type="text" name="optType">
			<br />
			上传文件1：
			<input type="file" name="file">
			<br />
			上传文件2：
			<input type="file" name="file">
			<br />
			<input type="submit" value="提交">
		</form>
	</body>
</html>

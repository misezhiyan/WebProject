<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>INDEX</title>
<script type="text/javascript" src="ajax.js"></script>
<script type="text/javascript" src="static/js/ajax.js"></script>
</head>
<body>
	welcom to webProject!
	<br>
	<input type="button" value="测试按钮" onclick="clickb()">
	<form action="login/loginPage.do">
		<input type="submit" value="测试servelet按钮">
	</form>
</body>
<script type="text/javascript">
	function clickb() {
		alert('test');
	}
</script>
</html>
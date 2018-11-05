<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta  charset="UTF-8"/>
	<title></title>
</head>
<body>

	<h3>过滤器传递参数</h3>
	<form action="login"method="get">
		<table>
			<tr>
				<td>用户名</td> 
				<td><input type="text" name="name"value=""> </td>
			</tr>
			<tr>
				<td>年龄</td> 
				<td><input type="number" name="age"value=""> </td>
			</tr>
			<tr><td><input type="submit" name="登录" value="登录"> </td></tr>
		</table>
	</form>
</body>
</html>
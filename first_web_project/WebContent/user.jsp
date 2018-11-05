<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta  charset="UTF-8"/>
	<title></title>
</head>
<body>
 <h3>这里是脚部文件</h3>
 <% request.setCharacterEncoding("UTF-8"); %>
 <%=request.getParameter("username") %>
</body>
</html>
<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta  charset="UTF-8"/>
	<title></title>
</head>
<body>

	<h3>JSP表达式</h3>
	<!-- 表达式必须有返回值，末尾不能加分号 -->
	<%= Math.max(3, 4) %>
	
	<h3>脚部页面</h3>
	<!--只能是静态的 不能传递参数 -->
	<%@  include file="user.jsp" %>
	
	<h3>引入动态页面</h3>  
	
	<jsp:include page="user.jsp" flush="true">
                <jsp:param name="username" value="张三"/>
            </jsp:include>
</body>
</html>
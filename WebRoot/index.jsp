<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <%--  	<a href="${pageContext.request.contextPath }/hello.action">访问第一个struts2</a>
   
   	<a href="${pageContext.request.contextPath }/add_User.action">添加</a>
   
   	<a href="${pageContext.request.contextPath }/del_User.action">删除</a>
    --%>
   <br />
   <c:if test="${sessionScope.user==null}">
  		<a href="${pageContext.request.contextPath}/login.jsp">登陆</a>
  	</c:if>
  	<c:if test="${sessionScope.user!=null}">
  		欢迎您：${sessionScope.user}
  	</c:if>
   
   
  </body>
</html>

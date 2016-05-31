<%@ page language="java"  pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>企业人力资源管理系统</title>
    
  </head>
<FRAMESET id=index 
border=0 frameSpacing=0 rows=120,* frameBorder=no><FRAME id=topFrame 
name=topFrame src="top.jsp" noResize scrolling=no><FRAMESET 
border=0 frameSpacing=0 frameBorder=no cols=20%,*><FRAME id=leftFrame 
name=leftFrame src="mygo.jsp" noResize scrolling=no><FRAME 
id=mainFrame name=mainFrame src="right.jsp" noResize 
scrolling=no></FRAMESET></FRAMESET><noframes></noframes></html>

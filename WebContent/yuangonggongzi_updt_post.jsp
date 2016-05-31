<%@ page language="java"  pageEncoding="gb2312" import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
request.setCharacterEncoding("gb2312"); 
response.setCharacterEncoding("gb2312"); 
%>
<jsp:useBean id="connDbBean" scope="page" class="db.db"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adminyanzheng.jsp' starting page</title>
  </head>
  <body>
  <%
String gonghao=request.getParameter("gonghao");String xingming=request.getParameter("xingming");String nianfen=request.getParameter("nianfen");String yuefen=request.getParameter("yuefen");String gongzi=request.getParameter("gongzi");String beizhu=request.getParameter("beizhu");
String id=request.getParameter("id");
String sql="update yuangonggongzi set gonghao='"+gonghao+"',xingming='"+xingming+"',nianfen='"+nianfen+"',yuefen='"+yuefen+"',gongzi='"+gongzi+"',beizhu='"+beizhu+"' where id= "+id;
connDbBean.executeUpdate(sql);
out.print("<script>alert('ÐÞ¸Ä³É¹¦!!');location.href='yuangonggongzi_list.jsp';</script>");
%>
  </body>
</html>



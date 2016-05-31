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
String gonghao=request.getParameter("gonghao");String xingming=request.getParameter("xingming");String kaoqin=request.getParameter("kaoqin");String riqi=request.getParameter("riqi");String beizhu=request.getParameter("beizhu");
String id=request.getParameter("id");
String sql="update kaoqinjilu set gonghao='"+gonghao+"',xingming='"+xingming+"',kaoqin='"+kaoqin+"',riqi='"+riqi+"',beizhu='"+beizhu+"' where id= "+id;
connDbBean.executeUpdate(sql);
out.print("<script>alert('ÐÞ¸Ä³É¹¦!!');location.href='kaoqinjilu_list.jsp';</script>");
%>
  </body>
</html>



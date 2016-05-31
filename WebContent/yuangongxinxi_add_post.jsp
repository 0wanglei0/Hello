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
 

String gonghao=request.getParameter("gonghao");String xingming=request.getParameter("xingming");String xingbie=request.getParameter("xingbie");String chushengnianyue=request.getParameter("chushengnianyue");String dianhua=request.getParameter("dianhua");String youxiang=request.getParameter("youxiang");String jiguan=request.getParameter("jiguan");String zuzhijigou=request.getParameter("zuzhijigou");String mima=request.getParameter("mima");String zhicheng=request.getParameter("zhicheng");String beizhu=request.getParameter("beizhu");
ResultSet RS_result=connDbBean.executeQuery("select * from [yuangongxinxi] where gonghao='"+gonghao+"'");

 if(RS_result.next())
{
out.print("<script>alert('该工号已经存在,请换其他工号!');window.history.go(-1);</script>");
	}
else{

	
  	  	String sql="insert into yuangongxinxi(gonghao,xingming,xingbie,chushengnianyue,dianhua,youxiang,jiguan,zuzhijigou,mima,zhicheng,beizhu) values('"+gonghao+"','"+xingming+"','"+xingbie+"','"+chushengnianyue+"','"+dianhua+"','"+youxiang+"','"+jiguan+"','"+zuzhijigou+"','"+mima+"','"+zhicheng+"','"+beizhu+"') ";
  	  	
  	  	connDbBean.executeUpdate(sql);
  	  	out.print("<script>alert('添加成功!!');location.href='yuangongxinxi_add.jsp';</script>");
  	  
	}
RS_result.close();

 %>
  </body>
</html>


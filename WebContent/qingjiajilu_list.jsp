
<%@ page language="java"  pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="db.db"/>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>请假记录</title><LINK href="CSS.css" type=text/css 
rel=stylesheet>
    

  </head>

  <body >
  <p>已有请假记录列表：</p>
  <form name="form1" id="form1" method="post" action="">
   搜索:工号:
     <input name="bianhao" type="text" id="bianhao" />
     姓名
     <input name="mingcheng" type="text" id="mingcheng" />
     <input type="submit" name="Submit" value="查找" />
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF'>工号</td><td bgcolor='#CCFFFF'>姓名</td><td bgcolor='#CCFFFF'>请假日期</td>
    <td bgcolor='#CCFFFF'>请假类型</td>
    <td bgcolor='#CCFFFF'>请假事由</td><td bgcolor='#CCFFFF'>请假天数</td>
    <td width="138" align="center" bgcolor="CCFFFF">添加时间</td>
    
    <td width="60" align="center" bgcolor="CCFFFF">操作</td>
  </tr>
  <%
  String sql="";
  sql="select * from qingjiajilu where 1=1";
  if(request.getParameter("bianhao")=="" ||request.getParameter("bianhao")==null )
  {}
  else
  {
  	sql=sql+" and gonghao like '%"+new String(request.getParameter("bianhao").getBytes("8859_1"))+"%'";
  }
  if(request.getParameter("mingcheng")=="" ||request.getParameter("mingcheng")==null )
  {}
  else
  {
  	sql=sql+" and xingming like '%"+new String(request.getParameter("mingcheng").getBytes("8859_1"))+"%'";
  }
  sql=sql+" order by id desc";
 ResultSet RS_result=connDbBean.executeQuery(sql);
 String id="";
 String gonghao="";String xingming="";String qingjiariqi="";String qingjiashiyou="";String qingjiatianshu="";String qingjialeixing="";
 String addtime="";
 int i=0;
 float zs=0;
 
 
 
 
 while(RS_result.next()){
 i=i+1;
 id=RS_result.getString("id");
gonghao=RS_result.getString("gonghao");xingming=RS_result.getString("xingming");qingjiariqi=RS_result.getString("qingjiariqi");qingjiashiyou=RS_result.getString("qingjiashiyou");qingjiatianshu=RS_result.getString("qingjiatianshu");
 addtime=RS_result.getString("addtime");qingjialeixing=RS_result.getString("qingjialeixing");
 zs=zs+Float.valueOf(RS_result.getString("qingjiatianshu")).floatValue();
 
%>
  <tr>
    <td width="30" align="center"><%=i %></td>
    <td><%=gonghao %></td><td><%=xingming %></td><td><%=qingjiariqi %></td>
    <td><%=qingjialeixing %></td>
    <td><%=qingjiashiyou %></td><td><%=qingjiatianshu %></td>
    <td width="138" align="center"><%=addtime %></td>
    <td width="60" align="center"><a href="qingjiajilu_updt.jsp?id=<%=id%>">修改</a>  <a href="del.jsp?id=<%=id %>&tablename=qingjiajilu" onClick="return confirm('真的要删除？')">删除</a></td>
  </tr>
  	<%
  }
   %>
</table>
<br>
以上数据共<%=i %>条,共请假<%=zs%>天；<a style="cursor:hand" onClick="javascript:window.print();">打印本页</a>
  </body>
</html>


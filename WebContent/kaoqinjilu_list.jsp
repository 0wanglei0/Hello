
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
    
    <title>考勤记录</title><LINK href="CSS.css" type=text/css 
rel=stylesheet>
    

  </head>

  <body >
  <p>已有考勤记录列表：</p>
  <form name="form1" id="form1" method="post" action="">
   搜索:工号:
     <input name="bianhao" type="text" id="bianhao" />
     姓名
     <input name="mingcheng" type="text" id="mingcheng" />
     考勤 
     <select name='kaoqin' id='kaoqin'>
	   <option value="">所有</option>
       <option value="正常">正常</option>
       <option value="迟到">迟到</option>
       <option value="早退">早退</option>
       <option value="缺席">缺席</option>
     </select>
    <input type="submit" name="Submit" value="查找" />
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td bgcolor='#CCFFFF'>工号</td><td bgcolor='#CCFFFF'>姓名</td><td bgcolor='#CCFFFF'>考勤</td><td bgcolor='#CCFFFF'>日期</td><td bgcolor='#CCFFFF'>备注</td>
    <td width="138" align="center" bgcolor="CCFFFF">添加时间</td>
    
    <td width="60" align="center" bgcolor="CCFFFF">操作</td>
  </tr>
  <%
  String sql="";
  sql="select * from kaoqinjilu where 1=1";
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
  if(request.getParameter("kaoqin")=="" ||request.getParameter("kaoqin")==null )
  {}
  else
  {
  	sql=sql+" and kaoqin like '%"+new String(request.getParameter("kaoqin").getBytes("8859_1"))+"%'";
  }
  sql=sql+" order by id desc";
 ResultSet RS_result=connDbBean.executeQuery(sql);
 String id="";
 String gonghao="";String xingming="";String kaoqin="";String riqi="";String beizhu="";
 String addtime="";
 int i=0;
 
 
 
 
 
 while(RS_result.next()){
 i=i+1;
 id=RS_result.getString("id");
gonghao=RS_result.getString("gonghao");xingming=RS_result.getString("xingming");kaoqin=RS_result.getString("kaoqin");riqi=RS_result.getString("riqi");beizhu=RS_result.getString("beizhu");
 addtime=RS_result.getString("addtime");
 
 
%>
  <tr>
    <td width="30" align="center"><%=i %></td>
    <td><%=gonghao %></td><td><%=xingming %></td><td><%=kaoqin %></td><td><%=riqi %></td><td><%=beizhu %></td>
    <td width="138" align="center"><%=addtime %></td>
    <td width="60" align="center"><a href="kaoqinjilu_updt.jsp?id=<%=id%>">修改</a>  <a href="del.jsp?id=<%=id %>&tablename=kaoqinjilu" onClick="return confirm('真的要删除？')">删除</a></td>
  </tr>
  	<%
  }
   %>
</table><br>
以上数据共<%=i %>条,<a style="cursor:hand" onClick="javascript:window.print();">打印本页</a>
  </body>
</html>


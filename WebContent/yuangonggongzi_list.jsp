
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
    
    <title>Ա������</title><LINK href="CSS.css" type=text/css 
rel=stylesheet>
    

  </head>

  <body >
  <p>����Ա�������б�</p>
  <form name="form1" id="form1" method="post" action="">
   ����:����:
     <input name="bianhao" type="text" id="bianhao" />
     ����
     <input name="mingcheng" type="text" id="mingcheng" />
     ���
     <select name='nianfen' id='nianfen'>
	   <option value="">����</option>
       <option value="2011">2011</option>
       <option value="2010">2010</option>
       <option value="2009">2009</option>
       <option value="2008">2008</option>
       <option value="2007">2007</option>
     </select>
     �·�
     <select name='yuefen' id='yuefen'>
	 <option value="">����</option>
       <%
   int i=0;
   for(i=1;i<=12;i++)
   {
   	%>
       <option value="<%=i%>"><%=i%></option>
       <%
   }
   %>
     </select>
     <input type="submit" name="Submit" value="����" />
</form>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">���</td>
    <td bgcolor='#CCFFFF'>����</td><td bgcolor='#CCFFFF'>����</td><td bgcolor='#CCFFFF'>���</td><td bgcolor='#CCFFFF'>�·�</td><td bgcolor='#CCFFFF'>����</td><td bgcolor='#CCFFFF'>��ע</td>
    <td width="138" align="center" bgcolor="CCFFFF">���ʱ��</td>
    
    <td width="60" align="center" bgcolor="CCFFFF">����</td>
  </tr>
  <%
  String sql="";
  sql="select * from yuangonggongzi where 1=1";
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
  if(request.getParameter("nianfen")=="" ||request.getParameter("nianfen")==null )
  {}
  else
  {
  	sql=sql+" and nianfen like '%"+new String(request.getParameter("nianfen").getBytes("8859_1"))+"%'";
  }
  if(request.getParameter("yuefen")=="" ||request.getParameter("yuefen")==null )
  {}
  else
  {
  	sql=sql+" and yuefen like '%"+new String(request.getParameter("yuefen").getBytes("8859_1"))+"%'";
  }
  sql=sql+" order by id desc";
 ResultSet RS_result=connDbBean.executeQuery(sql);
 String id="";
 String gonghao="";String xingming="";String nianfen="";String yuefen="";String gongzi="";String beizhu="";
 String addtime="";
  i=0;
 
 
 
 
 
 while(RS_result.next()){
 i=i+1;
 id=RS_result.getString("id");
gonghao=RS_result.getString("gonghao");xingming=RS_result.getString("xingming");nianfen=RS_result.getString("nianfen");yuefen=RS_result.getString("yuefen");gongzi=RS_result.getString("gongzi");beizhu=RS_result.getString("beizhu");
 addtime=RS_result.getString("addtime");
 
 
%>
  <tr>
    <td width="30" align="center"><%=i %></td>
    <td><%=gonghao %></td><td><%=xingming %></td><td><%=nianfen %></td><td><%=yuefen %></td><td><%=gongzi %></td><td><%=beizhu %></td>
    <td width="138" align="center"><%=addtime %></td>
    <td width="60" align="center"><a href="yuangonggongzi_updt.jsp?id=<%=id%>">�޸�</a>  <a href="del.jsp?id=<%=id %>&tablename=yuangonggongzi" onClick="return confirm('���Ҫɾ����')">ɾ��</a></td>
  </tr>
  	<%
  }
   %>
</table><br>
�������ݹ�<%=i %>��,<a style="cursor:hand" onClick="javascript:window.print();">��ӡ��ҳ</a>
  </body>
</html>



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
    
    <title>��ټ�¼</title><script language="javascript" src="js/Calendar.js"></script>
    <LINK href="CSS.css" type=text/css rel=stylesheet>

  </head>
<script language="javascript">
function check()
{
	if(document.form1.gonghao.value==""){alert("�����빤��");document.form1.gonghao.focus();return false;}if(document.form1.xingming.value==""){alert("����������");document.form1.xingming.focus();return false;}
}
</script>
  <body >
  <%
  String id=request.getParameter("id");
   %>
  <form name="form1" id="form1" method="post" action="qingjiajilu_updt_post.jsp?id=<%=id %>">
  �޸���ټ�¼:
  <br><br>
  <%
  String sql="select * from qingjiajilu where id="+id;
  String gonghao="";String xingming="";String qingjiariqi="";String qingjiashiyou="";String qingjiatianshu="";
  ResultSet RS_result=connDbBean.executeQuery(sql);
  while(RS_result.next()){
  gonghao=RS_result.getString("gonghao");xingming=RS_result.getString("xingming");qingjiariqi=RS_result.getString("qingjiariqi");qingjiashiyou=RS_result.getString("qingjiashiyou");qingjiatianshu=RS_result.getString("qingjiatianshu");
  }
   %>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
     <tr><td>���ţ�</td><td><input name='gonghao' type='text' id='gonghao' value='<%= gonghao%>' /></td></tr><tr><td>������</td><td><input name='xingming' type='text' id='xingming' value='<%= xingming%>' /></td></tr><tr><td>������ڣ�</td><td><input name='qingjiariqi' type='text' id='qingjiariqi' value='<%= qingjiariqi%>' onclick="getDate(form1.qingjiariqi,'2')" need="1" readonly='readonly' /></td></tr><tr><td>������ɣ�</td><td><textarea name='qingjiashiyou' cols='50' rows='5' id='qingjiashiyou'><%=qingjiashiyou%></textarea></td></tr><tr><td>���������</td><td><input name='qingjiatianshu' type='text' id='qingjiatianshu' value='<%= qingjiatianshu%>' /></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="�ύ" onclick="return check();" />
      <input type="reset" name="Submit2" value="����" /></td>
    </tr>
  </table>
</form>

  </body>
</html>



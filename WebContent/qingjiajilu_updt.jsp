
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
    
    <title>请假记录</title><script language="javascript" src="js/Calendar.js"></script>
    <LINK href="CSS.css" type=text/css rel=stylesheet>

  </head>
<script language="javascript">
function check()
{
	if(document.form1.gonghao.value==""){alert("请输入工号");document.form1.gonghao.focus();return false;}if(document.form1.xingming.value==""){alert("请输入姓名");document.form1.xingming.focus();return false;}
}
</script>
  <body >
  <%
  String id=request.getParameter("id");
   %>
  <form name="form1" id="form1" method="post" action="qingjiajilu_updt_post.jsp?id=<%=id %>">
  修改请假记录:
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
     <tr><td>工号：</td><td><input name='gonghao' type='text' id='gonghao' value='<%= gonghao%>' /></td></tr><tr><td>姓名：</td><td><input name='xingming' type='text' id='xingming' value='<%= xingming%>' /></td></tr><tr><td>请假日期：</td><td><input name='qingjiariqi' type='text' id='qingjiariqi' value='<%= qingjiariqi%>' onclick="getDate(form1.qingjiariqi,'2')" need="1" readonly='readonly' /></td></tr><tr><td>请假事由：</td><td><textarea name='qingjiashiyou' cols='50' rows='5' id='qingjiashiyou'><%=qingjiashiyou%></textarea></td></tr><tr><td>请假天数：</td><td><input name='qingjiatianshu' type='text' id='qingjiatianshu' value='<%= qingjiatianshu%>' /></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onclick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>



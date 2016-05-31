
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
    
    <title>考勤记录</title><script language="javascript" src="js/Calendar.js"></script>
    <LINK href="CSS.css" type=text/css rel=stylesheet>

  </head>
<script language="javascript">
function check()
{
	if(document.form1.gonghao.value==""){alert("请输入工号");document.form1.gonghao.focus();return false;}if(document.form1.xingming.value==""){alert("请输入姓名");document.form1.xingming.focus();return false;}if(document.form1.beizhu.value==""){alert("请输入备注");document.form1.beizhu.focus();return false;}
}
</script>
  <body >
  <%
  String id=request.getParameter("id");
   %>
  <form name="form1" id="form1" method="post" action="kaoqinjilu_updt_post.jsp?id=<%=id %>">
  修改考勤记录:
  <br><br>
  <%
  String sql="select * from kaoqinjilu where id="+id;
  String gonghao="";String xingming="";String kaoqin="";String riqi="";String beizhu="";
  ResultSet RS_result=connDbBean.executeQuery(sql);
  while(RS_result.next()){
  gonghao=RS_result.getString("gonghao");xingming=RS_result.getString("xingming");kaoqin=RS_result.getString("kaoqin");riqi=RS_result.getString("riqi");beizhu=RS_result.getString("beizhu");
  }
   %>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
     <tr><td>工号：</td><td><input name='gonghao' type='text' id='gonghao' value='<%= gonghao%>' /></td></tr><tr><td>姓名：</td><td><input name='xingming' type='text' id='xingming' value='<%= xingming%>' /></td></tr><tr><td>考勤：</td><td><select name='kaoqin' id='kaoqin'>
       <option value="正常">正常</option>
       <option value="迟到">迟到</option>
       <option value="早退">早退</option>
       <option value="缺席">缺席</option>
     </select></td></tr><script language="javascript">document.form1.kaoqin.value='<%=kaoqin%>';</script><tr><td>日期：</td><td><input name='riqi' type='text' id='riqi' value='<%= riqi%>' onClick="getDate(form1.riqi,'2')" need="1" readonly='readonly' /></td></tr><tr><td>备注：</td><td><textarea name='beizhu' cols='50' rows='5' id='beizhu'><%=beizhu%></textarea></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onClick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>



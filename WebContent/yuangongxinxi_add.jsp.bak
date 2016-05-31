
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
    
    <title>员工信息</title><LINK href="CSS.css" type=text/css rel=stylesheet>
    <script language="javascript" src="js/Calendar.js"></script>

  </head>
<script language="javascript">
function check()
{
	if(document.form1.gonghao.value==""){alert("请输入工号");document.form1.gonghao.focus();return false;}if(document.form1.xingming.value==""){alert("请输入姓名");document.form1.xingming.focus();return false;}if(document.form1.dianhua.value==""){alert("请输入电话");document.form1.dianhua.focus();return false;}if(document.form1.mima.value==""){alert("请输入密码");document.form1.mima.focus();return false;}
}
function gow()
{
	document.location.href="yuangongxinxi_add.jsp?jihuabifffanhao="+document.form1.jihuabifffanhao.value;
}
</script>
  <body >
  <form name="form1" id="form1" method="post" action="yuangongxinxi_add_post.jsp">
  添加员工信息:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">    <tr><td>工号：</td><td><input name='gonghao' type='text' id='gonghao' value='' />&nbsp;*</td></tr><tr><td>姓名：</td><td><input name='xingming' type='text' id='xingming' value='' />&nbsp;*</td></tr><tr><td>性别：</td><td><select name='xingbie' id='xingbie'><option value="男">男</option><option value="女">女</option></select></td></tr><tr><td>出生年月：</td><td><input name='chushengnianyue' type='text' id='chushengnianyue' value='' readonly='readonly' onClick="getDate(document.form1.chushengnianyue,'2')" need='1' /></td></tr><tr><td>电话：</td><td><input name='dianhua' type='text' id='dianhua' value='' />&nbsp;*</td></tr><tr><td>邮箱：</td><td><input name='youxiang' type='text' id='youxiang' value='' /></td></tr><tr><td>籍贯：</td><td><input name='jiguan' type='text' id='jiguan' value='' /></td></tr><tr><td>组织机构：</td><td><select name='zuzhijigou' id='zuzhijigou'><%String sql="select zuzhimingcheng from zuzhijigou order by id desc";ResultSet RS_result=connDbBean.executeQuery(sql);while(RS_result.next()){String zuzhimingcheng=RS_result.getString("zuzhimingcheng");%><option value="<%= zuzhimingcheng%>" ><%=zuzhimingcheng%></option><%}%></select></td></tr><tr><td>密码：</td><td><input name='mima' type='text' id='mima' value='' />&nbsp;*</td></tr><tr><td>职称：</td><td><input name='zhicheng' type='text' id='zhicheng' value='' /></td></tr><tr><td>备注：</td><td><textarea name='beizhu' cols='50' rows='5' id='beizhu'></textarea></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onclick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


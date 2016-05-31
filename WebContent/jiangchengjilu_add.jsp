
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
    
    <title>奖惩记录</title><LINK href="CSS.css" type=text/css rel=stylesheet>
    <script language="javascript" src="js/Calendar.js"></script>

  </head>
<script language="javascript">
function check()
{
	if(document.form1.gonghao.value==""){alert("请输入工号");document.form1.gonghao.focus();return false;}if(document.form1.xingming.value==""){alert("请输入姓名");document.form1.xingming.focus();return false;}
}
function gow()
{
	document.location.href="jiangchengjilu_add.jsp?gonghao="+document.form1.gonghao.value;
}
</script>
  <body >
  <form name="form1" id="form1" method="post" action="jiangchengjilu_add_post.jsp">
  添加奖惩记录:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">    <tr><td>工号：</td><td><select name='gonghao' id='gonghao' onchange='gow();'><option value=''>请选择</option><%String sql="select gonghao from yuangongxinxi order by id desc";ResultSet RS_result=connDbBean.executeQuery(sql);while(RS_result.next()){ String gonghao=RS_result.getString("gonghao");%><option value="<%= gonghao%>" ><%=gonghao%></option><%}%></select>&nbsp;*</td></tr><%if(request.getParameter("gonghao")!=null){%><script language="javascript">document.form1.gonghao.value='<%=request.getParameter("gonghao")%>';</script><%}%><tr><td>姓名：</td><td><input name='xingming' type='text' id='xingming' <%if( request.getParameter("gonghao")!=null){String sql2="select xingming from yuangongxinxi where gonghao='"+request.getParameter("gonghao")+"'";ResultSet RS_result2=connDbBean.executeQuery(sql2);while(RS_result2.next()){%>value="<%=RS_result2.getString("xingming") %>"<%}}%>>&nbsp;*</td></tr><tr><td>奖惩：</td><td><select name='jiangcheng' id='jiangcheng'>
     <option value="奖励">奖励</option>
     <option value="惩罚">惩罚</option>
   </select></td></tr><tr><td>事由：</td><td><textarea name='shiyou' cols='50' rows='5' id='shiyou'></textarea></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onClick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


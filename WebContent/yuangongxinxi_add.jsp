
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
    
    <title>Ա����Ϣ</title><LINK href="CSS.css" type=text/css rel=stylesheet>
    <script language="javascript" src="js/Calendar.js"></script>

  </head>
<script language="javascript">
function check()
{
	if(document.form1.gonghao.value==""){alert("�����빤��");document.form1.gonghao.focus();return false;}if(document.form1.xingming.value==""){alert("����������");document.form1.xingming.focus();return false;}if(document.form1.dianhua.value==""){alert("������绰");document.form1.dianhua.focus();return false;}if(document.form1.mima.value==""){alert("����������");document.form1.mima.focus();return false;}
}
function gow()
{
	document.location.href="yuangongxinxi_add.jsp?jihuabifffanhao="+document.form1.jihuabifffanhao.value;
}
</script>
  <body >
  <form name="form1" id="form1" method="post" action="yuangongxinxi_add_post.jsp">
  ���Ա����Ϣ:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">    <tr><td>���ţ�</td><td><input name='gonghao' type='text' id='gonghao' value='' />&nbsp;*</td></tr><tr><td>������</td><td><input name='xingming' type='text' id='xingming' value='' />&nbsp;*</td></tr><tr><td>�Ա�</td><td><select name='xingbie' id='xingbie'><option value="��">��</option><option value="Ů">Ů</option></select></td></tr><tr><td>�������£�</td><td><input name='chushengnianyue' type='text' id='chushengnianyue' value='' readonly='readonly' onClick="getDate(document.form1.chushengnianyue,'2')" need='1' /></td></tr><tr><td>�绰��</td><td><input name='dianhua' type='text' id='dianhua' value='' />&nbsp;*</td></tr><tr><td>���䣺</td><td><input name='youxiang' type='text' id='youxiang' value='' /></td></tr><tr><td>���᣺</td><td><input name='jiguan' type='text' id='jiguan' value='' /></td></tr><tr><td>��֯������</td><td><select name='zuzhijigou' id='zuzhijigou'><%String sql="select zuzhimingcheng from zuzhijigou order by id desc";ResultSet RS_result=connDbBean.executeQuery(sql);while(RS_result.next()){String zuzhimingcheng=RS_result.getString("zuzhimingcheng");%><option value="<%= zuzhimingcheng%>" ><%=zuzhimingcheng%></option><%}%></select></td></tr><tr><td>���룺</td><td><input name='mima' type='text' id='mima' value='' />&nbsp;*</td></tr><tr><td>ְ�ƣ�</td><td><input name='zhicheng' type='text' id='zhicheng' value='' /></td></tr><tr><td>��ע��</td><td><textarea name='beizhu' cols='50' rows='5' id='beizhu'></textarea></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="�ύ" onclick="return check();" />
      <input type="reset" name="Submit2" value="����" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


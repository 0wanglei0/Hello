
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
    
    <title>���ڼ�¼</title><script language="javascript" src="js/Calendar.js"></script>
    <LINK href="CSS.css" type=text/css rel=stylesheet>

  </head>
<script language="javascript">
function check()
{
	if(document.form1.gonghao.value==""){alert("�����빤��");document.form1.gonghao.focus();return false;}if(document.form1.xingming.value==""){alert("����������");document.form1.xingming.focus();return false;}if(document.form1.beizhu.value==""){alert("�����뱸ע");document.form1.beizhu.focus();return false;}
}
</script>
  <body >
  <%
  String id=request.getParameter("id");
   %>
  <form name="form1" id="form1" method="post" action="kaoqinjilu_updt_post.jsp?id=<%=id %>">
  �޸Ŀ��ڼ�¼:
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
     <tr><td>���ţ�</td><td><input name='gonghao' type='text' id='gonghao' value='<%= gonghao%>' /></td></tr><tr><td>������</td><td><input name='xingming' type='text' id='xingming' value='<%= xingming%>' /></td></tr><tr><td>���ڣ�</td><td><select name='kaoqin' id='kaoqin'>
       <option value="����">����</option>
       <option value="�ٵ�">�ٵ�</option>
       <option value="����">����</option>
       <option value="ȱϯ">ȱϯ</option>
     </select></td></tr><script language="javascript">document.form1.kaoqin.value='<%=kaoqin%>';</script><tr><td>���ڣ�</td><td><input name='riqi' type='text' id='riqi' value='<%= riqi%>' onClick="getDate(form1.riqi,'2')" need="1" readonly='readonly' /></td></tr><tr><td>��ע��</td><td><textarea name='beizhu' cols='50' rows='5' id='beizhu'><%=beizhu%></textarea></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="�ύ" onClick="return check();" />
      <input type="reset" name="Submit2" value="����" /></td>
    </tr>
  </table>
</form>

  </body>
</html>



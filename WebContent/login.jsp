<%@ page language="java"  pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="db.db"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>企业人力资源管理系统</title>
    <style type="text/css">
<!--
body {
	background-image: url(images/hsgbg.gif);
}
.STYLE3 {color: #528311; font-size: 12px; }
.STYLE5 {	color: #72AC27;
	font-size: 26pt;
}
.STYLE6 {color: #FFFFFF;font-size:12px}
-->
    </style>

</head>

<body topmargin="0">
<table width="800" height="630" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="134" valign="bottom"><p>&nbsp;</p></td>
  </tr>
  <tr>
    <td height="496" valign="top"><table width="800" height="496" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="246" background="images/hsgbg2.gif"><table width="57%" height="51" border="0" align="center">
          <tr>
            <td><div style="font-family:宋体; color:#FFFFFF; filter:Glow(Color=#000000,Strength=2); WIDTH: 100%; FONT-WEIGHT: bold; FONT-SIZE: 19pt; margin-top:5pt">
                <div align="center" class="STYLE5"> 
                  <div align="right">企业人力资源管理系统</div>
                </div>
            </div></td>
          </tr>
        </table>
          <p>&nbsp;</p>
          <p>&nbsp;</p>
          <table width="100%" height="112" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="48%">&nbsp;</td>
            <td width="52%"><form name="form1" method="post" action="main.jsp">
                <table width="82%" border="0" align="left" cellpadding="0" cellspacing="0">
                  <tr>
                    <td height="30" ><span class="STYLE6">用户名</span></td>
                    <td width="79%" height="30"><input name="username" type="text" id="username" style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;">
                    </td>
                  </tr>
                  <tr>
                    <td height="30" class="STYLE6" >密&nbsp;&nbsp;码</td>
                    <td height="30"><input name="pwd" type="password" id="pwd" style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;"></td>
                  </tr>
                  <tr style="display:none">
                    <td height="30" class="STYLE6">权&nbsp;&nbsp;限</td>
                    <td height="30"><select name="cx" id="cx" style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;">
                        <option value="管理员">管理员</option>
                        <option value="教师">教师</option>
                        <option value="学生">学生</option>
                      </select>
                    </td>
                  </tr>
                  <tr>
                    <td height="30" ><input name="login" type="hidden" id="login" value="1"></td>
                    <td height="30"><input type="submit" name="Submit" value="登陆">
                      &nbsp;
                      <input name="reset" type="reset" id="Reset1" value="重置" /></td>
                  </tr>
                </table>
            </form></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>

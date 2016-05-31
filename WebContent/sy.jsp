<%@ page language="java"  pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登录</title>
    <link href="images/skin.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {font-size: 12px}
.STYLE3 {font-size: 12px; font-weight: bold; }
.STYLE4 {
	color: #03515d;
	font-size: 12px;
}
-->
</style>

  </head>

  <body >
 <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td colspan="2" valign="top">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" valign="top"><span class="left_bt">感谢您使用 企业人力资源管理系统 网站管理系统程序</span><br>
        <br>
      <span class="left_txt">&nbsp;<img src="images/ts.gif" width="16" height="16"> 提示：<br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="left_txt"><br>
        　 <br>
    </span></td>
  </tr>
  <tr>
    <td colspan="2">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" valign="top"><!--JavaScript部分-->

        <TABLE width=72% border=0 cellPadding=0 cellSpacing=0 id=secTable>
          <TBODY>
            <TR align=middle height=20>
              <TD align="center" class=sec1 >系统说明</TD>
            </TR>
          </TBODY>
        </TABLE>
      <TABLE class=main_tab id=mainTable cellSpacing=0
cellPadding=0 width=100% border=0>
          <!--关于TBODY标记-->
          <TBODY style="DISPLAY: block">
            <TR>
              <TD vAlign=top align=middle><TABLE width=98% border=0 align="center" cellPadding=0 cellSpacing=0>
                <TBODY>
                  <TR>
                    <TD colspan="3"></TD>
                  </TR>
                  <TR>
                    <TD height="5" colspan="3"></TD>
                  </TR>
                  <TR>
                    <TD width="4%" background="images/news-title-bg.gif"></TD>
                    <TD width="91%" background="images/news-title-bg.gif" class="left_ts">程序说明：</TD>
                    <TD width="5%" background="images/news-title-bg.gif" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD bgcolor="#FAFBFC">&nbsp;</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt"><span class="left_ts">1、</span>系统作者：xxxxxxxxxxxxxx</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD bgcolor="#FAFBFC">&nbsp;</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt"><span class="left_ts">2、技术支持</span></TD>
                    <TD bgcolor="#FAFBFC" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD bgcolor="#FAFBFC">&nbsp;</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt"><span class="left_ts">3、</span> 开发日期：<%
	  java.util.Date date = new java.util.Date();
java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA);

String result = format.format(date);
out.print(result);
	  %></TD>
                    <TD bgcolor="#FAFBFC" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD bgcolor="#FAFBFC">&nbsp;</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt"><span class="left_ts">4、版权所有</span></TD>
                    <TD bgcolor="#FAFBFC" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD height="5" colspan="3"></TD>
                  </TR>
                </TBODY>
              </TABLE></TD>
            </TR>
          </TBODY>
         
      </TABLE></td>
  </tr>
  <tr>
    <td height="40" colspan="2"><table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
      <tr>
        <td></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td width="2%">&nbsp;</td>
    <td width="51%" class="left_txt"><img src="images/icon-mail2.gif" width="16" height="11"> 客户服务邮箱：xxxxxx@qq.com<br>
        <img src="images/icon-phone.gif" width="17" height="14"> 官方网站：http://www.xxxxxxxx.com</td>
  </tr>
</table>
  </body>
</html>


<%@ page language="java"  pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>�û���¼</title>
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
    <td colspan="2" valign="top"><span class="left_bt">��л��ʹ�� ��ҵ������Դ����ϵͳ ��վ����ϵͳ����</span><br>
        <br>
      <span class="left_txt">&nbsp;<img src="images/ts.gif" width="16" height="16"> ��ʾ��<br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="left_txt"><br>
        �� <br>
    </span></td>
  </tr>
  <tr>
    <td colspan="2">&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2" valign="top"><!--JavaScript����-->

        <TABLE width=72% border=0 cellPadding=0 cellSpacing=0 id=secTable>
          <TBODY>
            <TR align=middle height=20>
              <TD align="center" class=sec1 >ϵͳ˵��</TD>
            </TR>
          </TBODY>
        </TABLE>
      <TABLE class=main_tab id=mainTable cellSpacing=0
cellPadding=0 width=100% border=0>
          <!--����TBODY���-->
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
                    <TD width="91%" background="images/news-title-bg.gif" class="left_ts">����˵����</TD>
                    <TD width="5%" background="images/news-title-bg.gif" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD bgcolor="#FAFBFC">&nbsp;</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt"><span class="left_ts">1��</span>ϵͳ���ߣ�xxxxxxxxxxxxxx</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD bgcolor="#FAFBFC">&nbsp;</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt"><span class="left_ts">2������֧��</span></TD>
                    <TD bgcolor="#FAFBFC" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD bgcolor="#FAFBFC">&nbsp;</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt"><span class="left_ts">3��</span> �������ڣ�<%
	  java.util.Date date = new java.util.Date();
java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA);

String result = format.format(date);
out.print(result);
	  %></TD>
                    <TD bgcolor="#FAFBFC" class="left_txt">&nbsp;</TD>
                  </TR>
                  <TR>
                    <TD bgcolor="#FAFBFC">&nbsp;</TD>
                    <TD bgcolor="#FAFBFC" class="left_txt"><span class="left_ts">4����Ȩ����</span></TD>
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
    <td width="51%" class="left_txt"><img src="images/icon-mail2.gif" width="16" height="11"> �ͻ��������䣺xxxxxx@qq.com<br>
        <img src="images/icon-phone.gif" width="17" height="14"> �ٷ���վ��http://www.xxxxxxxx.com</td>
  </tr>
</table>
  </body>
</html>


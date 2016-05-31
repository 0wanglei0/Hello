
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
    
    <title>图书馆信息管理系统</title>
    
<script language="javascript" src="js/Calendar.js"></script>
  </head>
  <%
  String id=request.getParameter("id");
   %>
  <body >
<DIV align=center><LINK href="qtimages/CSS.css" type=text/css 
rel=stylesheet>
<DIV align=center>
<TABLE width=779 height="77" border=0 cellPadding=0 cellSpacing=0>
  <TBODY>
  <TR>
    <TD height=77 align=center background="qtimages/main_04.gif"><div style="FONT-WEIGHT: bold; FONT-SIZE: 23pt; FILTER: Glow(Color=#00347F,Strength=4); WIDTH: 100%; COLOR: #ffffff; font-family: 黑体">图书馆信息管理系统</div></TD>
  </TR></TBODY></TABLE>
<TABLE style="BORDER-COLLAPSE: collapse" borderColor=#cccccc cellSpacing=0 
cellPadding=0 width=778 border=1 frame=vsides>
  <TBODY>
  <TR>
    <TD background=qtimages/nav-bg.gif height=39>
      </TD></TR></TBODY></TABLE></DIV>
        <table width="778" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#cccccc" frame=vsides style="border-collapse: collapse">
          <tr>
            <td valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td height="5"></td>
                </tr>
              </table>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="203" height="141" rowspan="2" align="left" valign="top">
</td>
                    <td width="571" align="left" valign="top" >






<table width="99%"  border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="center"><table width="100%" height="35"  border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="2%" align="left" background="qtimages/bian-bian.gif">&nbsp;</td>
                <td width="44%" align="left" valign="middle" background="qtimages/bian-bian.gif"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td height="24" valign="bottom" class="big STYLE2">会员注册</td>
                  </tr>
                  </table></td>
                <td width="54%" align="left" background="qtimages/bian-bian.gif"><table width="98%" border="0" align="left" cellpadding="0" cellspacing="0">
                  <tr>
                    <td height="23" align="right" valign="bottom"><font color="#FFFFFF">您现在的位置：首页 &gt;&gt;<span class="big STYLE2">会员注册</span></font> </td>
                    </tr>
                  </table></td>
              </tr>
                </table>
  




  <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse"> <form name="form1" id="form1" method="post" action="yonghuzhuce_add_post.jsp">
                <tr>
                  <td>用户名：</td>
                  <td><input name='yonghuming' type='text' id='yonghuming' value='' />
                    *</td>
                </tr>
                <tr>
                  <td>密码：</td>
                  <td><input name='mima' type='password' id='mima' value='' />
                    *</td>
                </tr>
                <tr>
                  <td>角色：</td>
                  <td><select name="juese" id="juese">
                    <option value="普通用户">普通用户</option>
                   
                  </select>
                  </td>
                </tr>
                <tr>
                  <td>性别：</td>
                  <td><input name="xingbie" type="radio" value="男" checked>
                    男
                    <input name="xingbie" type="radio" value="女">
                    女</td>
                </tr>
                <tr>
                  <td>电话：</td>
                  <td><input name='dianhua' type='text' id='dianhua' value='' size="30" /></td>
                </tr>
                <tr>
                  <td>QQ：</td>
                  <td><input name='QQ' type='text' id='QQ' value='' /></td>
                </tr>
                <tr>
                  <td>身份证：</td>
                  <td><input name='shenfenzheng' type='text' id='shenfenzheng' value='' size="30" /></td>
                </tr>
                <tr>
                  <td>地址：</td>
                  <td><input name='dizhi' type='text' id='dizhi' value='' size="50" /></td>
                </tr>
                <tr>
                  <td>&nbsp;</td>
                  <td><input type="submit" name="Submit" value="提交" onClick="return check();" />
                      <input type="reset" name="Submit2" value="重置" /></td>
                </tr></form>
              </table>
      



              </td>
          </tr>
      </table></td>
                  </tr>
              </table></td>
          </tr>
        </table>
        <LINK 
href="qtimages/CSS.css" type=text/css rel=stylesheet>
<DIV align=center>
<TABLE style="BORDER-COLLAPSE: collapse" borderColor=#cccccc cellSpacing=0 
cellPadding=0 width=778 border=0 frame=vsides>
  <TBODY>
  <TR>
    <TD align=left width="10%" background=qtimages/down-bg.gif 
    height=35><IMG height=35 src="qtimages/down-left.gif" 
      width=1></TD>
    <TD vAlign=bottom align=middle width="80%" 
    background=qtimages/down-bg.gif>&nbsp;</TD>
    <TD align=right width="10%" 
      background=qtimages/down-bg.gif><IMG height=35 
      src="qtimages/down-left.gif" width=1></TD></TR></TBODY></TABLE>
</DIV>

  </body>
</html>


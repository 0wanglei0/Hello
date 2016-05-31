
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
    
    <title>企业人力资源管理系统</title><script language="javascript" src="images/qkjs.js"></script>
<STYLE type=text/css> 
*{
	FONT-SIZE: 12px; COLOR: white
}
#logo {
	COLOR: white
}
#logo A {
	COLOR: white
}
FORM {
	MARGIN: 0px
}
</STYLE>


  </head>

<BODY style="BACKGROUND-IMAGE: url(images/bg.gif); MARGIN: 0px; BACKGROUND-REPEAT: repeat-x">

  <DIV id=logo 
style="BACKGROUND-IMAGE: url(images/logo.png); BACKGROUND-REPEAT: no-repeat">
    <DIV 
style="PADDING-RIGHT: 15px; BACKGROUND-POSITION: right 10%; DISPLAY: block; PADDING-LEFT: 0px; BACKGROUND-IMAGE: url(images/bg_banner_menu.gif); PADDING-BOTTOM: 0px; PADDING-TOP: 3px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 30px; TEXT-ALIGN: right"><span style="PADDING-RIGHT: 2px"> 当前用户：<%=request.getSession().getAttribute("username")%>，您的权限：<%=request.getSession().getAttribute("cx")%></span><IMG 
src="images/menu_seprator.gif" align=absMiddle> <A id=HyperLink3 
href="logout.jsp" target="_parent">退出系统</A> </DIV>
    <DIV style="DISPLAY: block; HEIGHT: 54px"></DIV>
    <DIV 
style="BACKGROUND-IMAGE: url(images/bg_nav.gif); BACKGROUND-REPEAT: repeat-x; HEIGHT: 30px">
      <TABLE cellSpacing=0 cellPadding=0 width="100%">
        <TBODY>
          <TR>
            <TD>
              <DIV><IMG src="images/nav_pre.gif" align=absMiddle> 欢迎 <SPAN 
      id=lblBra>企业人力资源管理系统</SPAN> 光临 </DIV>
            </TD>
            <TD align=right width="70%"><SPAN style="PADDING-RIGHT: 50px">今天是：<SCRIPT language=javascript>setCalendar();</SCRIPT><IMG 
      src="images/menu_seprator.gif" align=absMiddle> <SPAN 
      id=clock></SPAN></SPAN></TD>
          </TR>
        </TBODY>
      </TABLE>
    </DIV>
  </DIV>

</BODY>

</html>


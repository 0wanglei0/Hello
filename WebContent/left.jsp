
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
    
    <title>企业人力资源管理系统</title><STYLE type=text/css> 
{
	FONT-SIZE: 12px
}
#menuTree A {
	COLOR: #566984; TEXT-DECORATION: none
}
</STYLE>
<SCRIPT src="images/TreeNode.js" type=text/javascript></SCRIPT>
<SCRIPT src="images/Tree.js" type=text/javascript></SCRIPT>

</head>

 <BODY style="BACKGROUND-POSITION-Y: -120px; BACKGROUND-IMAGE: url(images/bg.gif); BACKGROUND-REPEAT: repeat-x">
<TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%">
  <TBODY>
    <TR>
      <TD width=10 height=29><IMG src="images/bg_left_tl.gif"></TD>
      <TD 
    style="FONT-SIZE: 18px; BACKGROUND-IMAGE: url(images/bg_left_tc.gif); COLOR: white; FONT-FAMILY: system">Main 
        Menu</TD>
      <TD width=10><IMG src="images/bg_left_tr.gif"></TD>
    </TR>
    <TR>
      <TD style="BACKGROUND-IMAGE: url(images/bg_left_ls.gif)"></TD>
      <TD id=menuTree 
    style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px; HEIGHT: 100%; BACKGROUND-COLOR: white" 
    vAlign=top></TD>
      <TD style="BACKGROUND-IMAGE: url(images/bg_left_rs.gif)"></TD>
    </TR>
    <TR>
      <TD width=10><IMG src="images/bg_left_bl.gif"></TD>
      <TD style="BACKGROUND-IMAGE: url(images/bg_left_bc.gif)"></TD>
      <TD width=10><IMG 
src="images/bg_left_br.gif"></TD>
    </TR>
  </TBODY>
</TABLE>
<SCRIPT type=text/javascript>
var tree = null;var root = new TreeNode('系统菜单');

var fun1 = new TreeNode('系统用户管理');
var fun2 = new TreeNode('用户管理', 'yhzhgl.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun1.add(fun2);
var fun3 = new TreeNode('部门管理', 'DepartmentMgr.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun1.add(fun3);
var fun4 = new TreeNode('员工管理', 'EmployeeMgr.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun1.add(fun4);
root.add(fun1);

var fun5 = new TreeNode('组织机构管理');
var fun6 = new TreeNode('组织机构添加', 'zuzhijigou_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun5.add(fun6);
var fun7 = new TreeNode('组织机构查询', 'zuzhijigou_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun5.add(fun7);

root.add(fun5);

var fun9 = new TreeNode('员工信息管理');
var fun10 = new TreeNode('员工信息添加', 'yuangongxinxi_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun9.add(fun10);
var fun11 = new TreeNode('员工信息查询', 'yuangongxinxi_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun9.add(fun11);
//var fun12 = new TreeNode('文件搜索', 'FileSearch.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun9.add(fun12);
root.add(fun9);

var fun13 = new TreeNode('绩效考核管理');
var fun14 = new TreeNode('请假记录添加', 'qingjiajilu_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun14);
var fun15 = new TreeNode('请假记录查询', 'qingjiajilu_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun15);
var fun155 = new TreeNode('奖惩记录添加', 'jiangchengjilu_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun155);
var fun1555 = new TreeNode('奖惩记录查询', 'jiangchengjilu_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun1555);
var fun15555 = new TreeNode('考勤记录添加', 'kaoqinjilu_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun15555);
var fun155555 = new TreeNode('考勤记录查询', 'kaoqinjilu_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun155555);
root.add(fun13);

var fun16 = new TreeNode('员工工资管理');
var fun17 = new TreeNode('员工工资添加', 'yuangonggongzi_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun16.add(fun17);
var fun18 = new TreeNode('员工工资查询', 'yuangonggongzi_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun16.add(fun18);
//var fun19 = new TreeNode('操作日志', 'OperationLog.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun16.add(fun19);
//var fun20 = new TreeNode('菜单排序', 'MenuSort.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun16.add(fun20);
root.add(fun16);

//var fun21 = new TreeNode('考勤管理');
//var fun22 = new TreeNode('签到签退', 'SignInOrOut.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun21.add(fun22);
//var fun23 = new TreeNode('考勤查询', 'HistoryQuery.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun21.add(fun23);
//var fun24 = new TreeNode('考勤统计', 'TimeStatistics.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun21.add(fun24);
//root.add(fun21);

var fun25 = new TreeNode('系统管理');
//var fun26 = new TreeNode('友情连接添加', 'youqinglianjie_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun26);
//var fun27 = new TreeNode('友情连接查询', 'youqinglianjie_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun27);
//var fun28 = new TreeNode('系统简介', 'dx.jsp?lb=系统简介', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun28);
//var fun29 = new TreeNode('系统公告', 'dx.jsp?lb=系统公告', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun29);
var fun30 = new TreeNode('数据备份', 'databack.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun25.add(fun30);
//var fun31 = new TreeNode('留言管理', 'liuyanban_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun31);
root.add(fun25);

tree = new Tree(root);tree.show('menuTree')
</SCRIPT>
</BODY>
</html>


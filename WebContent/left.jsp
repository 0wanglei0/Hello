
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
    
    <title>��ҵ������Դ����ϵͳ</title><STYLE type=text/css> 
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
var tree = null;var root = new TreeNode('ϵͳ�˵�');

var fun1 = new TreeNode('ϵͳ�û�����');
var fun2 = new TreeNode('�û�����', 'yhzhgl.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun1.add(fun2);
var fun3 = new TreeNode('���Ź���', 'DepartmentMgr.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun1.add(fun3);
var fun4 = new TreeNode('Ա������', 'EmployeeMgr.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun1.add(fun4);
root.add(fun1);

var fun5 = new TreeNode('��֯��������');
var fun6 = new TreeNode('��֯�������', 'zuzhijigou_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun5.add(fun6);
var fun7 = new TreeNode('��֯������ѯ', 'zuzhijigou_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun5.add(fun7);

root.add(fun5);

var fun9 = new TreeNode('Ա����Ϣ����');
var fun10 = new TreeNode('Ա����Ϣ���', 'yuangongxinxi_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun9.add(fun10);
var fun11 = new TreeNode('Ա����Ϣ��ѯ', 'yuangongxinxi_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun9.add(fun11);
//var fun12 = new TreeNode('�ļ�����', 'FileSearch.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun9.add(fun12);
root.add(fun9);

var fun13 = new TreeNode('��Ч���˹���');
var fun14 = new TreeNode('��ټ�¼���', 'qingjiajilu_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun14);
var fun15 = new TreeNode('��ټ�¼��ѯ', 'qingjiajilu_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun15);
var fun155 = new TreeNode('���ͼ�¼���', 'jiangchengjilu_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun155);
var fun1555 = new TreeNode('���ͼ�¼��ѯ', 'jiangchengjilu_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun1555);
var fun15555 = new TreeNode('���ڼ�¼���', 'kaoqinjilu_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun15555);
var fun155555 = new TreeNode('���ڼ�¼��ѯ', 'kaoqinjilu_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun13.add(fun155555);
root.add(fun13);

var fun16 = new TreeNode('Ա�����ʹ���');
var fun17 = new TreeNode('Ա���������', 'yuangonggongzi_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun16.add(fun17);
var fun18 = new TreeNode('Ա�����ʲ�ѯ', 'yuangonggongzi_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun16.add(fun18);
//var fun19 = new TreeNode('������־', 'OperationLog.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun16.add(fun19);
//var fun20 = new TreeNode('�˵�����', 'MenuSort.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun16.add(fun20);
root.add(fun16);

//var fun21 = new TreeNode('���ڹ���');
//var fun22 = new TreeNode('ǩ��ǩ��', 'SignInOrOut.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun21.add(fun22);
//var fun23 = new TreeNode('���ڲ�ѯ', 'HistoryQuery.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun21.add(fun23);
//var fun24 = new TreeNode('����ͳ��', 'TimeStatistics.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun21.add(fun24);
//root.add(fun21);

var fun25 = new TreeNode('ϵͳ����');
//var fun26 = new TreeNode('�����������', 'youqinglianjie_add.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun26);
//var fun27 = new TreeNode('�������Ӳ�ѯ', 'youqinglianjie_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun27);
//var fun28 = new TreeNode('ϵͳ���', 'dx.jsp?lb=ϵͳ���', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun28);
//var fun29 = new TreeNode('ϵͳ����', 'dx.jsp?lb=ϵͳ����', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun29);
var fun30 = new TreeNode('���ݱ���', 'databack.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
fun25.add(fun30);
//var fun31 = new TreeNode('���Թ���', 'liuyanban_list.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
//fun25.add(fun31);
root.add(fun25);

tree = new Tree(root);tree.show('menuTree')
</SCRIPT>
</BODY>
</html>


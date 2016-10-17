# 29个你必须知道的Linux命令
================

1. ls<br>
　　列举出当前工作目录的内容（文件或文件夹）

2. mkdir<br>
　　创建文件夹

3. pwd<br>
　　显示当前目录

4. cd<br>
　　设置工作目录（进入指定目录）

5. rmdir<br>
　　删除指定文件夹

6. rm<br>
　　删除指定文件

7. cp<br>
　　对文件或文件夹进行复制

8. mv<br>
　　对文件或文件夹进行移动

9. cat<br>
　　查看文件内容

10. tail<br>
　　显示给定文件的最后10行内容<br>
　　tail -f 文件  查看文件并刷新文件

11. less<br>
　　按页或按窗口打印文件内容<br>
Ctrl + F 向前翻页   Ctrl + B 向后翻页

12. grep<br>
　　在给定文件中搜索字符串<br>
　　　　* grep -i "char" 文件 忽略字符串大小写<br>
　　　　* grep -r "char" 文件 递归搜寻字符串<br>

13. find<br>
　　在给定位置搜寻与条件匹配的文件<br>
　　* find -name  区分大小写<br>
　　* find -iname  不区分大小写<br>

14. tar<br>
　　创建、查看和提取tar压缩文件<br>
　　tar -cvf 创建对应压缩文件<br>
　　tar -tvf 查看压缩文件<br>
　　tar -xvf 提取压缩文件<br>

15. gzip<br>
　　gzip命令创建和提取压缩文件<br>
　　gzip -d 提取压缩文件

16. unzip<br>
　　对gzip文件解压缩<br>    unzip -l 查看文件内容

17. help<br>
　　-help 列出所有可用命令<br>    命令 + -h：  查看命令的具体的用法

18. whatis<br>
　　描述给定的命令

19. man<br>
　　为给定的命令显示一个手册页面

20. exit<br>
　　结束当前终端

21. ping<br>
　　检测网络连接和服务器状态

22. who<br>
　　列举出当前登陆的用户名

23. su<br>
　　切换不同的用户 su - root

24. uname<br>
　　显示关于系统的重要信息

25. free<br>
　　显示系统的空闲内存   -m  单位是kb   -g单位是GB

26. df<br>
　　查看文件系统中磁盘的使用情况   df -h 将结果以可读的方式显示

27. ps/kill<br>
　　显示进程/杀掉进程<br>
　　ps -ef|grep ssh<br>
　　查找特定进程<br>

28. top<br>
　　按照CPU占用的情况显示占用量较大的进程   top -u 查看用户的CPU使用排名情况

29. shutdown<br>
　　关闭计算机   shutdown -f 重启

30. netstat -tunlp | grep 端口号<br>
　　查询端口占用 例 ：netstat -tunlp |grep 22

31. 文件赋予权限（权限为rwx）<br>
　　chmod 权限 文件名<br>
　　chmod u+x 权限 文件名    u+x  当前用户    x   执行权限  <br>
　　chmod ug+x 权限 文件名   ug+x 用户组用户<br>
　　1）删除其他用户的权限<br>
　　　　chmod o-x filename <br>
　　2）删除文件权限<br>
　　　　chmod ugo-x filename 或 chmod a-x filename<br>
　　3）删除文件夹及文件夹内文件权限<br>
　　　　现在，假设有一文件夹 TEST，里面有一些脚本，所有这些（包括 TEST 文件夹）拥有权限-rwxrwxr-x。<br>
　　　　如果你想移除用户组的写权限，你可以运行命令：<br>
　　　　　　chmod -R g-w TEST<br>
　　　　运行命令 ls -l，你讲看到列出的 TEST 文件夹的权限信息是 drwxr-xr-x。<br>
　　　　用户组被去除了写权限（其目录下的所有文件也如此）。<br>
32. 查看文件大小<br>
　　ls -l filename | awk '{ print $5 }' <br>
　　du -sh filename <br>
33. 数据库使用其他表结构创建指定的表<br>
　　CREATE TABLE IF NOT EXISTS bl_ad_conv_log_20160829 LIKE bl_ad_conv_log_yyyymmdd;<br>
34. 输出时间戳<br>
　　date + %s<br>
35. 解决代码提交冲突方法<br>
　　http://stackoverflow.com/questions/21559119/how-to-resolve-conflicts-in-egit<br>
36. 查找影响范围<br>
　　ctrl + g<br>
37. Integer类型比较<br>
　　ObjectUtils.equals()<br>
38. git冲突的解决<br>
#提交本地的修正<br>
#git commit FILE_NAME -m "xxxx"<br>
#取最新<br>
#git pull
#打开冲突的文件<br>
#找到 ====== 的地方<br>
#判断保留和删除<br>
#然后保存<br>
#将冲突的文件重新加入到git中<br>
#git add FILE_NAME<br>
#再次cocmmit<br>
#git commit<br>
#提交到远程<br>
#git push<br>

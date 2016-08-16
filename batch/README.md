# 29个你必须知道的Linux命令
================

*1. ls
    列举出当前工作目录的内容（文件或文件夹）

*2. mkdir
    创建文件夹

*3. pwd
    显示当前目录

*4. cd
    设置工作目录（进入指定目录）

*5. rmdir
    删除指定文件夹

*6. rm
    删除指定文件

*7. cp
    对文件或文件夹进行复制

*8. mv
对文件或文件夹进行移动

*9. cat
    查看文件内容

*10. tail
    显示给定文件的最后10行内容   tail -f 文件  查看文件并刷新文件

*11. less
    按页或按窗口打印文件内容  Ctrl + F 向前翻页   Ctrl + B 向后翻页

*12. grep
    在给定文件中搜索字符串
    *grep -i "char" 文件 忽略字符串大小写
    *grep -r "char" 文件 递归搜寻字符串

*13. find
    在给定位置搜寻与条件匹配的文件
    * find -name  区分大小写
    * find -iname  不区分大小写

*14. tar
    创建、查看和提取tar压缩文件
    *tar -cvf 创建对应压缩文件
    *tar -tvf 查看压缩文件
    *tar -xvf 提取压缩文件

*15. gzip
    gzip命令创建和提取压缩文件 gzip -d 提取压缩文件

*16. unzip
    对gzip文件解压缩   unzip -l 查看文件内容

*17. help
    -help 列出所有可用命令     命令 + -h：  查看命令的具体的用法

*18. whatis
    描述给定的命令

*19. man
    为给定的命令显示一个手册页面

*20. exit
    结束当前终端

*21. ping
    检测网络连接和服务器状态

*22. who
    列举出当前登陆的用户名

*23. su
    切换不同的用户

*24. uname
    显示关于系统的重要信息

*25. free
    显示系统的空闲内存   -m  单位是kb   -g单位是GB

*26. df
    查看文件系统中磁盘的使用情况   df -h 将结果以可读的方式显示

*27. ps/kill
    显示进程/杀掉进程
    
    ps -ef|grep ssh
        查找特定进程

*28. top
    按照CPU占用的情况显示占用量较大的进程   top -u 查看用户的CPU使用排名情况

*29. shutdown
    关闭计算机   shutdown -f 重启
    
*30. netstat -tunlp | grep 端口号
    查询端口占用 例 ：netstat -tunlp |grep 22
    
*31 文件赋予权限（权限为rwx）
    chmod 权限 文件名
    chmod u+x 权限 文件名    u+x  当前用户    x   执行权限  
    chmod ug+x 权限 文件名   ug+x 用户组用户
    （1）删除其他用户的权限
        chmod o-x filename 
    （2）删除文件权限
        chmod ugo-x filename 或 chmod a-x filename
    （3）删除文件夹及文件夹内文件权限
        现在，假设有一文件夹 TEST，里面有一些脚本，所有这些（包括 TEST 文件夹）拥有权限 -rwxrwxr-x。如果你想移除用户组的写权限，你可以运行命令：
            chmod -R g-w TEST
        运行命令 ls -l，你讲看到列出的 TEST 文件夹的权限信息是 drwxr-xr-x。用户组被去除了写权限（其目录下的所有文件也如此）。

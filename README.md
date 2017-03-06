# Hello
=========

play

SHOW view

how can i use github well

and how to make a refs from readme.md to readme.md

and how to the change line

[play well github readme.md](https://github.com/guodongxiaren/README "github readme edit")

[install hbase phphbaseadmin](https://github.com/hivefans/phphbaseadmin)

[package to exe file](http://www.cnblogs.com/icewee/articles/2073203.html "jar包转换exe")

git ssh key 生成命令： ssh-keygen -t rsa -C “haiyan.xu.vip@gmail.com”  

#### 设计模式

* 设计模式的6个原则（根本在于高内聚低耦合、感觉都是为了降低耦合，降低各个类之间的关联度，避免互相影响）
[http://www.uml.org.cn/sjms/201211023.asp](http://www.uml.org.cn/sjms/201211023.asp)

 	* 单一职责原则
		一个人  干一个人的活   不互相干扰  
		注意点： 修正既存的代码的时候，很容易职责扩散， 注意及时重构 （这意思对吧）	 
		被工作再次细分的时候可能每个人干的活有重复的部分，所以要重新分配工作使每个人干的活不互相干扰	
	* 里氏替换原则  
		1、尽量不要重载父类的方法，可以实现父类的抽象方法  
		2、重载父类方法时，形参的广度要大于父类方法中的形参  
		3、就是不要动老子的东西  
	* 依赖倒置原则  
		1、面向接口编程 高层对象不依赖底层对象（底层改变不影响高层）  
		就是老子给你生出来了，前期教育也都做够了，以后的路你自己咋走我不管，但是你也不能干扰老子的生活（这个应该不对）  
		应该是龙生九子，各有不同，这个应该是对的。  
	* 接口隔离原则  
		1、分化接口， 接口的职责单一化，但也不能太细  
		比如吃中餐和吃西餐  不需要每个餐厅把筷子和刀叉都准备好，只需要准备对应的餐具准备好就可以了  
	* 迪米特法则  
		1、降低对象之间的依赖，自己的事情自己能做就做(感觉不是很理解)  
	* 开闭原则  
		 前面5条的总纲，遵守就符合了开闭原则，但是不强求，不能强制的刻意的为了迎合规则进行编程，  
		 职责单一，保护老子给予的东西，老子生的儿子可以不一样 儿子不会影响老子，接口要简单，降低耦合


#### 深入学习方向  

[http://www.cnblogs.com/huaxingtianxia/p/5724093.html](http://www.cnblogs.com/huaxingtianxia/p/5724093.html)  
* 解读jdk  [http://www.cnblogs.com/qingmaple/p/6076296.html](http://www.cnblogs.com/qingmaple/p/6076296.html)  


	* 第一  读jdk  
	
	* 第二  经常编写代码 做实例  
	 
	* 第三   系统分析师 整合 记录 10000小时  
	 	1.java基础 java高级   
		2 http协议，servlet，structs框架的思想。  
		3 spring 深入理解ioc aop 事务控制  
		4 Hibernate mybatis  
		5 jvm,堆栈，垃圾回收  
		6 设计模式（23中设计模式），清楚的知道应用场景  
		7 xml json  
		8 数据库 oracle（function produce package）块,区,段,表-rac  
		9 数据库 mysql （function produce）- 分库分表（mysql cluster）等  
		10 java方向 meavn nginx tomcat  
		11 负载均衡（nginx lvs等）    
		12 缓存db redis mem等  

#### 数据库  

[数据库锁相关](http://blog.csdn.net/samjustin1/article/details/52210125)  
[Mysql lock](http://www.jb51.net/article/58039.htm)  
感觉就是锁就是属性  通过事物实现  mysql  
但是貌似sqlserver的锁是增删改查的时候加的  
但是也是通过事物判断的(holdlock意思是加共享锁，直到事物结束才释放)  
sqlserver : begin tran表示开始事务， commit tran表示提交事务，rollback tran表示回滚事物  

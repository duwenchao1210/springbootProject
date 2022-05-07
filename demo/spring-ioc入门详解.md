#spring-ioc入门详解 2022-04-20 张老师
##任何学习方式最好的学习方式直接去官网查看官方文档；
##ioc是思想，DI是实现手段;
##spring 官方推荐使用TOOL sts;
##spring主要学习IOC、AOP、TRANSITION;
##spring bean的管理方式
##主配置文件引入副配置文件（太多的话可以使用通配符）
##xml配置：配置对象 id唯一，name不唯一属别名可以在一个对象中可以添加多个；alias标签添加对象别名；对于多个对象来说，id,name不可冲突！
##xml属性注入：（添加有参构造时，需要添加无参的构造器）通过对象的set方法给属性注入值，实现标签###<property name="" value="">
###<propery name=""><value></value><property>
###需要调用对象的set方法；set注入比较常用；
##java properties属性
##什么是解耦？强耦合、松散耦合
##注入集合：List、Set、Map
##作用域：scope:singleton、prototype、websocket、request、session、application
##rpc
##spring为什么要用单例？有没有问题？
##spring中定义工厂方法 动态工厂、静态工程
##多敲，多练肌肉记忆
##depends-on
##autowire 自动注入 按照byName和ByType 可以配置全局自动注入
##注解
##学习由浅入深，循序渐进！
##动态代理用来做方法增强！jdk动态代理，基于接口；cglib动态代理 ASM详解了解，及学习；
##看是看不会的，要多敲
#springBoot mvc项目结构 开发 热部署 -2022-04-24
##打包依赖、1.简化配置方便运维；2.批量开关服务器3.更适合做微服务；
##为什么不用war包而用jar包
##黑盒角度出发，快速应用框架搭建稳定项目；针对框架学习其实现原理；
##热部署：jrebel
##模板引擎 thymeleaf 占位符，模板代码${}
#2022-04-25
##springboot项目开发
##了解、学习、应用bootstrop
##thymeleaf @标签可以帮我们自动加上contextpath jrerebl
##json 报文 code、message、data
##springboot thymeleaf使用
##spring data jpa学习及使用
##spring data jpa自定义接口
##spring data jpa使用方便但是不灵活
##spring data jpa 自定义 hql 面向对象 @Query
##spring data jpa N+1问题
##1.自己解决问题的能力2.代码量
##hibernate 上线后出了问题不好排查
##mybatis框架 需要写sql 目前是比较流行的，比较灵活
##基于xml配置的mybatis、基于注解方式的mybatis;
##传统项目里mybatis如何使用？springboot项目中mybatis如何使用？mybatis逆向工程、curd、简化开发
##mybatis-plus
##查看mybatis官网，了解mybatis
##mybatis的example
##mybatis-generate-gui 图形化界面代码辅助生成使用；
#企业项目开发中的角色、流程、任务分配 -2022-04-26
##开发流程 -需求->设计->实现
##项目角色分配 项目经理->技术总监->项目组长->后端开发->设计师->产品经理->前端
##光看是看不懂的，要多敲代码！多敲代码
##OA用户模块
##分析需求->设计流程->原型图->
##敏捷开发（适合本公司自己产品） 瀑布流开发（适合甲乙双方模式）
##ajax异步请求
##规范开发流程
##Controller 主要跟前端数据做交互
##Service 主要跟后数据做交互
##要善于总结和发现问题的习惯
##利用Filter对URL进行鉴权
##springboot统一异常处理
##对于删除数据，需要具备追溯历史数据的能力
##了解前端，熟悉一款前端框架
##课后作业，权限认证
##修改密码，注册功能
##一定要具备自学能力
##springboot上传资源映射
#权限管理 RBAC 2022-04-27
##mybatis-plus的了解和使用
##启动springboot jar包时 可以动态设置配置文件
##概念上的东西，手动多去实践，彻底理解功能使用
##将灵活数据配置到配置文件
##页面嵌套，重复页面提取
##sitematch（框架） 主要用来做页面布局
##2022-04-28
##根据需求优化项目
##工作流实现（spring security,solry）
##dubbo RPC远程服务调用，springcloud,cxf wsdl soap
##spring cloud alibaba 底层基于dubbo
##dubbo必须要学会
##OA用户模块
##事务相关
##多表关联查询
##redis、mongodb
##系统设置-> 账号列表、角色管理、权限管理
##mybatis 多表关联查询 id列明问题
##mybatis 映射原理
##动态代理反复学习
##前端页面，重复页面动态生成时，字段问题，目的是减少修改的次数
##input标签序列化统一取值，name值选定
##写作业！！！！！！
##动态代理学习！
##Odata 基于restful协议实现的查询
##多表关联CRUD
##文件上传组件使用
##模态窗口
##mybatis 批量插入数据
##springboot配置多条sql语句执行
##每天写作业！！！要求
##FastDFS 中间件的使用
#2022-04-29
##开发权限认证、Icheck、Mybatis plus
##OA用户模块06
###1.权限管理CRUD
####角色->权限 用户->角色
###2.使用权限
###3.项目暂停
###4.Mybatis Plus 代码生成器 CRUD
###勤画动能流程图
###Mybatis Plus 配置比较简单  约定大于配置
###tomcat服务器 
#Nginx相关 动静分离 uri伪静态 ->动态代理7层（应用服务器）|
#lvs 4层代理 |缓存memcached|Ehcached
#分布式 dubbo
#了解Nginx和Tengine
##Http和方向代理
##nginx就是HTTP服务器的一种，属于七层网络的应用；LVS是基于4层网络
##同类别服务器Apache httpD、IIS(属于windows)
##urlRewrite 页面重写
##电脑上装载虚拟机
##gcc是c语言中的编译器
##学习linux命令行 shell脚本语法
##服务器内核每个进程能打开多少文件句柄个数
## 2022-05-05
##nginx 配置文件详解
##nginx 知识点有很多，需要不断去学习
##流处理、批处理
##gzip 网络压缩 提高传输效率 压缩和解压缩 网络带宽小的情况下使用
##虚拟主机
##参考ngnix官网，tengine.taobao.org官网
##系统化学习，体系化学习
##http、https、ssl相关协议
##ngnix.conf详细配置学习
##方向代理？ what、why、how 正向代理？ 角度不同 用户角度称之为正向，服务器角度称之为反向代理
##方向（正向） 代理（过滤上网、负载均衡、URL hash 软防火墙、节省IP 地址、功能性的） 服务器
##代理服务器因为访问压力需要做负载均衡
##ngnix 先找精确匹配，后去找根匹配
##302跳转
##返回数据时，是否经过代理服务器
##httpd-tool apache工具
##负载均衡 反向代理配合upstream 使用
##winscp 远程linux服务器工具使用
##ngnix 配置tomcat集群 
##ngnix （负载均衡）轮询访问的一种方式，可以调整策略 
##ngnix 策略种类 1.权重 2.ip_hash 3.url_hash
##http_proxy 本地磁盘缓存 I/O 性能问题 ngnix不支持内存缓存
##作业，搭建vm虚拟机
##健康检查模块 tengine 具备的模块
##nginx session 共享配置 memcached脚本 存储session
##2022-05-06
##动静分离
###静态请求尽量不要经过tomcat；可以放到ngnix去处理静态资源，配置location
##URL重写
##springsession
##SSL 保证数据传输中的安全
###Http协议不安全，ssl进行数据加密，涉及加密算法，sha1,sha256,md5,hash 加密，特点是不可逆，解密算法，服务器端加密-客户端解密；加密和解密两种算法；非对称加密：AES 公钥、私钥，第三方认证CA，防劫持，防篡改！
###SSL和TLS
###DNS劫持
##抓包工具
##青花瓷
###实现伪造证书
##tomcat session失效时间是30分钟
##linux 时间同步ntpd
## autoindex on 自动生成列表
## ngnix.conf中配置loaction 别名 alias,因为不支持多root
##课程以项目驱动
##springboot 所有项目都打jar包
## 启动jar包 java -jar 可以指定启动配置文件
##什么是架构师？用来提升系统运行效率
##ngnix 虚拟目录
##OpenSSL 生成公钥和私钥 学习及使用
###ngnix 使用自签名证书 在ngnix.conf文件中配置
###善于总结
###SSL需要4次握手
###server.crt在浏览器是如何解析的
##不断巩固所学的知识点
##FASTDFS(C语言写的) 文件存储服务器 HDFS（java写的）
###用户不直接访问storage server 需要中间代理程序
###如何保证不同的客户端浏览器，上传到不同的节点
###FastDFS-client 上传文件
### group 做冗余备份 不同group里的数据不同，同一group中的数据相同
### apache httpd 1.x学习及了解
###raid方式 分硬件和软件 阵列
###Lvs 4层负载
###创建256个文件夹 256*256
###FastDFS不好安装，c语言写的程序
###项目
###LVS负载均衡器 只建立连接，不握手
###安装FastDFS 需要N多个依赖
###docker 了解和学习
###tracker -主节点  storage -从节点
###FastDFS 之旅
###base64是可逆的算法
###提问题时将问题描述清楚
### java 开发客户端应用；ngnix做代理
###nginx配置 client 需要插件
###节省研发和运维上的成本
###java开发fastdfs客户端
###
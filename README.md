>记录成长，成为更好的自己！

# dockerwithcloud
这是一个docker-componse部署springcloud微服务的项目，
可以通过这个项目熟悉docker-componse部署微服务的简单应用。

##项目模块
- eureka-server
    == 注册中心 == 端口号 8888
    
- service
    == 服务提供者(代码实现) == 端口号 8887
    
- client
    == 服务消费者(调用服务) == 端口号 8889
    
    
## 运行方法
1. 需要有[**docker**](https://jingyan.baidu.com/article/48b558e38824133f38c09ad2.html)，[**docker-componse**](https://blog.csdn.net/weixin_43549578/article/details/85097952)，**maven**环境

2. 首先到项目根目录 使用mvn clean package -Dmaven.test.skip=true命令打包项目
3. 然后使用docker-componse -f docker-componse.yml up -d命令构建项目以及启动项目
4. docker-componse会执行项目中的Dockerfile构建出3个docker镜像 并使用镜像自动开启3个容器。
5. 至此项目已经成功启动。


## 项目测试
- 项目运行后访问运行项目的主机ip加8889端口加/client/sayHello
- 示例:192.168.1.31:8889/clinet/sayHello
- 如果出现Hello Docker With Cloud页面即说明部署成功


## 常见问题
docker容器启动后如果无法访问网页可能需要耐心等待容器中项目加载完毕
，部署在linux系统上如果无法访问页面请检查主机与虚拟机是否可以ping通，linux端口是否开放或防火墙是否已经关闭！


## 项目版本
- springcloud 2.1.2
- springboot 2.1.7


## 开发者
Jiuchen - 1971719180@qq.com
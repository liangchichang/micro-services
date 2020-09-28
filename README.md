# micro_services
个人项目—微服务学习

###项目服务 - 对应用到的技术栈
- 主POM 仅做依赖版本管理
- registration-center-* 注册中心服务
    1. eureka => spring-cloud-eureka-server
    2. zookeeper => spring-cloud-zookeeper
    3. consul => spring-cloud-consul 

- config-center-* 配置中心服务
    - spring-cloud-config

- consumer-* 客户端
    1. spring-cloud-ribbon
    2. spring-cloud-openfeign
    
- payments-service-* 服务端
    1. spring-cloud-hystrix

- payment-service 服务端依赖，数据库交互
    1. mybatis


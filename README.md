# 工程简介



# 延伸阅读




# 原始application.properties配置
```text

# 应用名称
spring.application.name=sunsysteam
# 应用服务 WEB 访问端口
server.port=8080
# 数据库驱动：
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
# 数据源名称
spring.datasource.name=defaultDataSource
# 数据库连接地址
spring.datasource.url=jdbc:mysql://localhost:3306/blue?serverTimezone=UTC
# 数据库用户名&密码：
spring.datasource.username=***
spring.datasource.password=***
# THYMELEAF (ThymeleafAutoConfiguration)
# 开启模板缓存（默认值： true ）
spring.thymeleaf.cache=true
# 检查模板是否存在，然后再呈现
spring.thymeleaf.check-template=true
# 检查模板位置是否正确（默认值 :true ）
spring.thymeleaf.check-template-location=true
#Content-Type 的值（默认值： text/html ）
spring.thymeleaf.content-type=text/html
# 开启 MVC Thymeleaf 视图解析（默认值： true ）
spring.thymeleaf.enabled=true
# 模板编码
spring.thymeleaf.encoding=UTF-8
# 要被排除在解析之外的视图名称列表，⽤逗号分隔
spring.thymeleaf.excluded-view-names=
# 要运⽤于模板之上的模板模式。另⻅ StandardTemplate-ModeHandlers( 默认值： HTML5)
spring.thymeleaf.mode=HTML5
# 在构建 URL 时添加到视图名称前的前缀（默认值： classpath:/templates/ ）
spring.thymeleaf.prefix=classpath:/templates/
# 在构建 URL 时添加到视图名称后的后缀（默认值： .html ）
spring.thymeleaf.suffix=.html
```


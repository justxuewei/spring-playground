FROM openjdk:8u181

LABEL MAINTAINER "Xavier Niu <a@nxw.name>"

# 自动创建tmp数据卷
# SpringBoot默认使用Tomcat容器
# Tomcat默认使用/tmp目录作为工作目录
VOLUME "/tmp"

# 拷贝文件并重命名
ADD "spring-boot-docker-1.0.jar" "app.jar"

# 启动程序
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]

#以java为基础镜像
FROM hub.c.163.com/library/java:latest
#自己项目Jar包的路径
ADD cloud-eureka-server7001-1.0-SNAPSHOT.jar eureka7001.jar
#端口
EXPOSE 7001
#运行Jar
ENTRYPOINT ["java", "-jar", "/eureka7001.jar"]
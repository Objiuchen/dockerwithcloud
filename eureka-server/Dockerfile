FROM java
MAINTAINER Jiuchen <1971719180@qq.com>

ADD ./target/docker-eureka.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/docker-eureka.jar"]

EXPOSE 8888
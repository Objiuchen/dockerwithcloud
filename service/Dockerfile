FROM java
MAINTAINER Jiuchen <1971719180@qq.com>

ADD ./target/docker-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/docker-service.jar"]

EXPOSE 8887
FROM java
MAINTAINER Jiuchen <1971719180@qq.com>

ADD ./target/docker-client.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/docker-client.jar"]

EXPOSE 8889
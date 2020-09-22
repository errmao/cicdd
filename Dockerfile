FROM java:8

# 作者
MAINTAINER tinyQ <errmao@aliyun.com>

VOLUME /tmp

# 将jar包添加到容器中并更名为corebusiness.jar
COPY  /target/cicdd-0.0.1-SNAPSHOT.jar /data/cicdd-0.0.1-SNAPSHOT.jar

# 设置时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

# 最后/data/corebusiness.jar 是容器中jar包的位置
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/data/cicdd-0.0.1-SNAPSHOT.jar"]
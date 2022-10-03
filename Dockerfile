From openjdk:11

WORKDIR /app

RUN mkdir /app/logs/

COPY ./target/payroll-0.0.1-SNAPSHOT.jar /app/payroll-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","payroll-0.0.1-SNAPSHOT.jar"]
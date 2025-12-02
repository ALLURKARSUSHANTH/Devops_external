FROM open-jdk-17 as build
WORKDIR /app
COPY . .
RUN javac Calculator.java

FROM open-jre-17
WORKDIR /app
COPY . .
RUN ["java","Calculator"]
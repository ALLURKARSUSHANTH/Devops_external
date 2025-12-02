FROM open-jdk-17 as buildworker
WORKDIR /app
COPY . .
RUN javac Calculator.java

FROM open-jre-17
WORKDIR /app
COPY --from=buildworker /app/Calculator.class .
RUN ["java","Calculator"]
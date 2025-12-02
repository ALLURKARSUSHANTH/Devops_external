FROM openjdk:17 AS builder
WORKDIR /app
COPY . . 
RUN javac Calculator.java

FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/Calculator.class . 
CMD ["java", "Calculator"]

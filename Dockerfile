FROM open-jdk:17 AS builder
WORKDIR /app
COPY . .
RUN javac Calculator.java

FROM open-jre:17 AS runner
WORKDIR /app
COPY --from=builder /app/Calculator.class .
RUN ["java","Calculator"]
FROM : open-jdk-17 As builder
WORKDIR / app
COPY . .
RUN javac Calculator.java

FROM : open-jre
WORKDIR / app
COPY . .
RUN ["java"],["Calculator"]



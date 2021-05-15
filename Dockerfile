FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /app/vsap
ARG JAR_FILE=build/libs/book-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} book.jar
ENTRYPOINT ["java","-jar","book.jar"]

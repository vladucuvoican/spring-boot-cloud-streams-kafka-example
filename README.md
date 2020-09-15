# spring-boot-cloud-streams-kafka-example

Spring Cloud Stream comes packed with two separate binders for Kafka 
- spring-cloud-stream-binder-kafka 
- spring-cloud-stream-binder-kafka-streams
 
 The first one is the one that I used in this example and it's meant to write a classic event-driven applications with producers and consumers. On the other hand, the second binder is meant to be used when developing stream processing applications. It uses Kafka Streams library under the hood.

### Description
Basic hello world example with spring cloud streams using kafka 

Run the application from the command line using the Spring Boot Maven plugin:

### How To run it

``` 
docker-compose up -d

mvn spring-boot:run
```

### How To test
http://localhost:8080/message?payload=hello

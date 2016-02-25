package com.above.springMongo.spring_mongodb_data_rest;

/**
 * Main Boot to run
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
@Configuration
@EnableMongoRepositories
@Import(RepositoryRestMvcConfiguration.class)
@ImportResource("classpath:./resources/SpringContext.xml")
@EnableAutoConfiguration
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

package com.sendermessage.queueSender;


import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class QueueSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueueSenderApplication.class, args);
	}

}

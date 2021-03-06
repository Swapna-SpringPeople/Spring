package com.sakha.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sakha.spring.di.services.EmailService;
import com.sakha.spring.di.services.MessageService;
import com.sakha.spring.di.services.TwitterService;

@Configuration
@ComponentScan(value={"com.sakha.spring.di.consumer"})
public class DIConfiguration {
	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
	


}

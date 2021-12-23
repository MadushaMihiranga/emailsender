package com.treinetic.assignment.emailsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailsenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailsenderApplication.class, args);
	}
		/*@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		EmailDTO email = new EmailDTO("madushamihiranga@outlook.com","Test Email Service","This is a Test Email");
		service.sendMail(email);
	}*/

}

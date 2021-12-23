package com.treinetic.assignment.emailsender.message;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class EmailSenderService {

    private JavaMailSender mailSender;




    public void sendMail(EmailDTO emailDTO){
        SimpleMailMessage message = new SimpleMailMessage();
        //message.setTo(emailDTO.getToEmail());
        message.setTo("madushamihiranga@outlook.com");
        message.setText(emailDTO.getBody());
        message.setSubject(emailDTO.getSubject());
        message.setFrom("testm6225@gmail.com");
        mailSender.send(message);
        log.info("Sent an email to : {}", (Object) message.getTo());
    }

}

package com.treinetic.assignment.emailsender.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class messageListener {

    @Autowired
    private EmailSenderService service;

    @RabbitListener(queues = MQconfig.QUEUE)
    public void listener(CustomMessage message){
        //System.out.println(message);
        System.out.println(message.getMessage().getToEmail());
        service.sendMail(message.getMessage());

    }

}

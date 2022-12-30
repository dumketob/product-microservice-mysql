package com.example.demo.port.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ItemConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemConsumer.class);

    @RabbitListener(queues = {"item"})
    public void consume(String message){
        LOGGER.info(String.format("Received message -> %s", message));
    }
}
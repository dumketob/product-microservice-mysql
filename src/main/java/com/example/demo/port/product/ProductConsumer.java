package com.example.demo.port.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ProductConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductConsumer.class);

    @RabbitListener(queues = {"product"})
    public void consume(String message){
        LOGGER.info(String.format("Received message -> %s", message));
    }
}
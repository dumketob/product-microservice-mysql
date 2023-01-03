package com.example.demo.port.admin.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class PriceChangeConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PriceChangeConsumer.class);

    @RabbitListener(queues = {"item"})
    public void consume(String message) {

        LOGGER.info(String.format("Received message -> %s", message));
        // todo: Business Logic
    }
}
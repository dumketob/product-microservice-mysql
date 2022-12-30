package com.example.demo.port.product;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
@Service
public class Producer {

    void send() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        factory.setPort(15672);

        factory.setUsername("user1");
        factory.setPassword("MyPassword");
        channel.queueDeclare("products_queue", false, false, false, null);

        String message = "product details";
        channel.basicPublish("", "products_queue", null, message.getBytes());

        channel.close();
        connection.close();

    }
}

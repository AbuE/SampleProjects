package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.producer.Producer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @RequestMapping(value = "/publish")
    @ResponseBody
    public String sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
        return message;
    }
}

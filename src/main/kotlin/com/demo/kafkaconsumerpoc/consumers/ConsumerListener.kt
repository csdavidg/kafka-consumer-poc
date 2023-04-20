package com.demo.kafkaconsumerpoc.consumers

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ConsumerListener {

    /*@Value("\${kafka.topic}")
    lateinit var topicName: String*/

    @KafkaListener(topics = ["test"])
    fun kafkaConsumer(message: ConsumerRecord<String, Any>) {
        println(message)
    }

}
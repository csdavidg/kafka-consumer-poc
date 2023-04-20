package com.demo.kafkaconsumerpoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
class KafkaConsumerPocApplication

fun main(args: Array<String>) {
	runApplication<KafkaConsumerPocApplication>(*args)
}

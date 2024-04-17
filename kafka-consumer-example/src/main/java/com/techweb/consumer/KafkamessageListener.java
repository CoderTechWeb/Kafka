package com.techweb.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Service;

@Service
public class KafkamessageListener {

	Logger log = LoggerFactory.getLogger(KafkamessageListener.class);

	@KafkaListener(topics = "techweb-demo-1", groupId = "tw-group-1")
	public void consume1(String message, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
			@Header(KafkaHeaders.OFFSET) String offset) {
		log.info("Consumer1 consume the message {} {} {}", message, topic, offset);
	}

	@KafkaListener(topics = "techweb-demo-1", groupId = "tw-group-1")
	public void consume2(String message) {
		log.info("Consumer2 consume the message {}", message);
	}

	@KafkaListener(topics = "techweb-demo-1", groupId = "tw-group-1")
	public void consume3(String message) {
		log.info("Consumer3 consume the message {}", message);
	}

	@KafkaListener(topics = "techweb-demo-1", groupId = "tw-group-1")
	public void consume4(String message) {
		log.info("Consumer4 consume the message {}", message);
	}

}

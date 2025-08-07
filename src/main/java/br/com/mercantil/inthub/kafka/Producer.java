package br.com.mercantil.inthub.kafka;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.mercantil.inthub.model.Cliente;

@Service
public class Producer {

    private Logger logger = LogManager.getLogger();
    private KafkaTemplate<String,Cliente> kafkaTemplate;

    public Producer(KafkaTemplate<String,Cliente> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(){

    }

}

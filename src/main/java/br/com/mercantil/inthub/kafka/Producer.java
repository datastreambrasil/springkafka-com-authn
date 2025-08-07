package br.com.mercantil.inthub.kafka;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import br.com.mercantil.inthub.model.Cliente;

@Service
public class Producer {

    private Logger logger = LogManager.getLogger();
    private KafkaTemplate<String,Cliente> kafkaTemplate;

    public Producer(KafkaTemplate<String,Cliente> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(Cliente cliente){
        try {
            SendResult<String,Cliente> r = kafkaTemplate.send("demojava-producer-0708", cliente).get();
            logger.info("Mensagem produzida no topico {}, offset {}, particao {}", r.getRecordMetadata().topic(), r.getRecordMetadata().offset(), 
            r.getRecordMetadata().partition());
        } catch (Exception e) {
           logger.error("Mensagem nao foi produzida", e);
        }
    }
}

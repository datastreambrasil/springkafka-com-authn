package br.com.mercantil.inthub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercantil.inthub.kafka.Producer;
import br.com.mercantil.inthub.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ClienteController {

    private Producer producer;

    public ClienteController(Producer producer){
        this.producer = producer;
    }

    
    @GetMapping("/produce")
    public void produce(){
        producer.produce(new Cliente("Ronaldo", "Sao caetano do sul - SP"));
    }

}

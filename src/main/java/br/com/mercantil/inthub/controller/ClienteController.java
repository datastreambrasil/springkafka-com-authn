package br.com.mercantil.inthub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ClienteController {

    
    @GetMapping("/produce")
    public void produce(){

    }

}

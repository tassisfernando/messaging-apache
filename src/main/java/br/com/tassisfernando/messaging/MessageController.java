package br.com.tassisfernando.messaging;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MessageController {

    private Producer producer;

    public MessageController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        producer.sendMessage("Hello, " + name);
        return "OK";
    }
}

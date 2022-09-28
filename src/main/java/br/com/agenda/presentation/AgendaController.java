package br.com.agenda.presentation;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendaController {

    @GetMapping("/consultar")
    public String consultar(){
        return "Hello Agenda";
    }
}

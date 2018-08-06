package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Criado por douglas.santos em 06/08/2018
 */
@Controller
public class EventoController {

    @RequestMapping("/cadastrarEvento")
    public String form(){
        return "eventos/formEvento";
    }
}

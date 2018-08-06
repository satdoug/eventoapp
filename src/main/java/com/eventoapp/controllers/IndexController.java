package com.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Criado por douglas.santos em 06/08/2018
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return  "index";
    }
}

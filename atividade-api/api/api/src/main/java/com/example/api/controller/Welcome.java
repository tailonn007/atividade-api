package com.example.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Welcome {

    @RequestMapping("/")
    public String mensagem(){
        return "Bem-vindo!";

    }
    @RequestMapping("/dev")
    public String dev(){
        return "Feito por: Alberth Tailon";

    }

    @RequestMapping("/turma")
    public String turma(){
        return "G99160";
    }
    @RequestMapping("/curso")
    public String curso(){
        return "Desenvolvimento de Sistema";
    }


}

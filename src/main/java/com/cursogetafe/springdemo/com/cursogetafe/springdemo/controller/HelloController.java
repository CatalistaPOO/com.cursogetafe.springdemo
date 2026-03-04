package com.cursogetafe.springdemo.com.cursogetafe.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String saludo(Model model){
        // "message" es la clave que usaremos en el HTML
        model.addAttribute("message", "Hola desde Thymeleaf");

        // DEBE coincidir con el nombre del archivo en /templates
        return "hello";
    }
}

package com.cursogetafe.springdemo.com.cursogetafe.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String sumar(Model model, @RequestParam int s1, @RequestParam int s2){
        int suma = s1 + s2;
        // "suma" es la clave que usaremos en el HTML
        model.addAttribute("sumaTotal", suma);

        // DEBE coincidir con el nombre del archivo en /templates
        return "calculator";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JaliNet
 */
@RestController
@RequestMapping("/Costume")
public class Controlador {
    @GetMapping("/inicio")
    public String Costume(){
        String Paginahtml = "<h1>Esto es un encabezado</h1>\n" +
                            "<p>Esto es un párrafo</p>" +
                "<button onclick=''>Consultar</button>";

        return Paginahtml;
    }
    
}

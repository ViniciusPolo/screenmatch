package br.com.vinicius.screenmatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {
    @GetMapping("/series")
    public String obterSeries(){
        return "Aqui irão aparecer as séries";
    }
}

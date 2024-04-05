package br.com.vinicius.screenmatch.controller;

import br.com.vinicius.screenmatch.repository.SerieRepository;
import br.com.vinicius.screenmatch.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository repositorio;

    @GetMapping("/series")
    public List<Serie> obterSeries(){
        return repositorio.findAll();
    }
}

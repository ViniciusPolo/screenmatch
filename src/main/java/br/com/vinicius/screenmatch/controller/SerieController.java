package br.com.vinicius.screenmatch.controller;

import br.com.vinicius.screenmatch.dto.SerieDTO;
import br.com.vinicius.screenmatch.repository.SerieRepository;
import br.com.vinicius.screenmatch.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository repositorio;

    @GetMapping("/")
    public String inicio(){
        return"<h1>Bem Vindo ao ScreenMatch</h1>" +
                "<p>Essa rota é somente para teste de LiveReload! </p>";
    }

    @GetMapping("/series")
    public List<SerieDTO> obterSeries(){
        return repositorio.findAll()
                .stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(), s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getSinopse()))
                .collect(Collectors.toList());
    }
}

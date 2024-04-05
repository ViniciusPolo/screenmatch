package br.com.vinicius.screenmatch.controller;

import br.com.vinicius.screenmatch.dto.SerieDTO;
import br.com.vinicius.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieService servico;

    @GetMapping("/")
    public String inicio(){
        return"<h1>Bem Vindo ao ScreenMatch</h1>" +
                "<p>Essa rota é somente para teste de LiveReload! </p>";
    }

    @GetMapping("/series")
    public List<SerieDTO> obterSeries(){
        return servico.obterTodasAsSeries();
    }

    @GetMapping("/series/top5")
    public List<SerieDTO> obterSeriesTop5(){
        return servico.obterTop5Series();
    }
}

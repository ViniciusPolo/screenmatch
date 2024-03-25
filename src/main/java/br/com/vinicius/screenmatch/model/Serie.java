package br.com.vinicius.screenmatch.model;

import br.com.vinicius.screenmatch.service.ConsultaChatGPT;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

@Data
@ToString
@NoArgsConstructor
@Entity
@Table(name = "series")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    @Enumerated(EnumType.STRING)
    private Categoria genero;
    private String atores;
    private String poster;
    private String sinopse;

    @Transient
    private List<Episodio> episodios = new ArrayList<>();

    public Serie(DadosSerie dadosSerie) {
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0);
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim()); //get only first item, before comma
        this.atores = dadosSerie.atores();
        this.poster = dadosSerie.poster();
        this.sinopse = dadosSerie.sinopse();
        //this.sinopse = ConsultaChatGPT.obterTraducao(dadosSerie.sinopse());
    }
}


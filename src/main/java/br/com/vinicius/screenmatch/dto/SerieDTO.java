package br.com.vinicius.screenmatch.dto;

import br.com.vinicius.screenmatch.model.Categoria;
import jakarta.persistence.*;

public record SerieDTO(
    Long Id,
    String titulo,
    Integer totalTemporadas,
    Double avaliacao,
    Categoria genero,
    String atores,
    String poster,
    String sinopse){
}

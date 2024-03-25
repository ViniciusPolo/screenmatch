package br.com.vinicius.screenmatch.repository;

import br.com.vinicius.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}

package dev.moisesborges.openradio.data;

import dev.moisesborges.openradio.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
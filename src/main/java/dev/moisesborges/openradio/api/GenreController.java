package dev.moisesborges.openradio.api;

import dev.moisesborges.openradio.data.GenreRepository;
import dev.moisesborges.openradio.domain.Genre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1")
public class GenreController {

    private final GenreRepository genreRepository;

    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @GetMapping("/genres")
    public List<Genre> fetchAllGenres() {
        return genreRepository.findAll();
    }
}

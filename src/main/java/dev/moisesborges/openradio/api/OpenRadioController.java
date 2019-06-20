package dev.moisesborges.openradio.api;

import dev.moisesborges.openradio.domain.Station;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OpenRadioController {

    private final StationRepository stationRepository;

    OpenRadioController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @GetMapping("/home")
    List<Station> fetchAll() {
        return stationRepository.findAll();
    }

    @GetMapping("/search")
    List<Station> search() {
        return stationRepository.findAll();
    }

}

package dev.moisesborges.openradio.api;

import dev.moisesborges.openradio.data.StationRepository;
import dev.moisesborges.openradio.domain.Station;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StationController {

    private final StationRepository stationRepository;

    public StationController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @GetMapping("/stations")
    List<Station> fetchAllStations(@RequestParam("genre") @Nullable String genre) {
        if (genre == null) {
            return stationRepository.findAll();
        } else {
            return stationRepository.findStationsByGenre(genre);
        }
    }

    @GetMapping("/stations/{stationId}")
    Station fetchStation(@PathVariable("stationId") Long stationId) {
        return stationRepository.findById(stationId).orElseThrow(IllegalArgumentException::new);
    }

    @GetMapping("/stations/featured")
    List<Station> fetchFeaturedStations() {
        return stationRepository.findFeaturedStations();
    }
}

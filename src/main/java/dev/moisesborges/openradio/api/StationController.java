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
    List<Station> fetchAllStations() {
        return stationRepository.findAll();
    }

    @GetMapping("/stations/{stationId}")
    Station fetchStation(@PathVariable("stationId") Long stationId) {
        return stationRepository.findById(stationId).orElseThrow(IllegalArgumentException::new);
    }
}

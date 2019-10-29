package dev.moisesborges.openradio.api;

import dev.moisesborges.openradio.data.StationRepository;
import dev.moisesborges.openradio.domain.Station;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/v1")
public class SearchController {

    private final StationRepository stationRepository;

    public SearchController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @GetMapping("/search")
    public List<Station> search(@RequestParam("name") String name) {
        return stationRepository.findStationsByName(name);
    }
}
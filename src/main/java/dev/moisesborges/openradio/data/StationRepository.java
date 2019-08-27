package dev.moisesborges.openradio.data;

import dev.moisesborges.openradio.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {

    @Query("SELECT s FROM Station s WHERE s.name LIKE %?1%")
    List<Station> findStationsByName(String name);
}

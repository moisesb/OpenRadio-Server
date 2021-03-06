package dev.moisesborges.openradio.data;

import dev.moisesborges.openradio.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {

    @Query("SELECT s FROM Station s WHERE lower(s.name) LIKE concat('%',lower(?1),'%')")
    List<Station> findStationsByName(String name);

    @Query("SELECT s FROM Station s LEFT JOIN s.genres g WHERE g.name = ?1")
    List<Station> findStationsByGenre(String genreName);

    @Query("SELECT s FROM Station s WHERE s.featured = TRUE")
    List<Station> findFeaturedStations();
}

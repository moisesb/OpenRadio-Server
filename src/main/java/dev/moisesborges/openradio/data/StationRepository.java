package dev.moisesborges.openradio.data;

import dev.moisesborges.openradio.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}

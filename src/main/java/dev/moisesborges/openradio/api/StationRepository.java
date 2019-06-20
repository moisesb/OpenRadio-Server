package dev.moisesborges.openradio.api;

import dev.moisesborges.openradio.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}

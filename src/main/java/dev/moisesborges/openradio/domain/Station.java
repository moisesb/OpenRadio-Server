package dev.moisesborges.openradio.domain;

import lombok.Data;
import lombok.experimental.Tolerate;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Station {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String countryCode;
    private String locality;
    private String streamUrl;
    @Nullable
    private String thumbnailUrl;

    public Station(String name, String countryCode, String locality,
                   String streamUrl, @Nullable String thumbnailUrl) {
        this.name = name;
        this.countryCode = countryCode;
        this.locality = locality;
        this.streamUrl = streamUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    @Tolerate
    public Station() {
        // Do nothing
    }
}

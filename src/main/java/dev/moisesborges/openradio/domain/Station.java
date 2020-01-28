package dev.moisesborges.openradio.domain;

import lombok.Data;
import lombok.experimental.Tolerate;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

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
    @Column(columnDefinition = "boolean default false")
    private Boolean featured;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(
            name = "station_genre",
            joinColumns = @JoinColumn(name = "station_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id")
    )
    private List<Genre> genres;

    public Station(String name, String countryCode, String locality,
                   String streamUrl, @Nullable String thumbnailUrl,
                   Boolean featured) {
        this.name = name;
        this.countryCode = countryCode;
        this.locality = locality;
        this.streamUrl = streamUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.featured = featured;
    }

    @Tolerate
    public Station() {
        // Do nothing
    }
}

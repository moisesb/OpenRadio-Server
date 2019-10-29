package dev.moisesborges.openradio.domain;

import lombok.Data;
import lombok.experimental.Tolerate;

import javax.persistence.*;

@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Genre {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Genre(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Tolerate
    public Genre() {
        // Do nothing
    }
}
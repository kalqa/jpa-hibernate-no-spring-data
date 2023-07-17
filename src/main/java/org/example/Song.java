package org.example;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Builder
@Getter
@Entity
@Setter
@Table(name = "song")
@ToString
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String artist;

    public Song() {

    }

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public Song(Long id, String name, String artist) {
        this.id = id;
        this.name = name;
        this.artist = artist;
    }
}

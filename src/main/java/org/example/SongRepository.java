package org.example;

import java.util.List;
import java.util.Optional;

public interface SongRepository {

    List<Song> findAll();

    Optional<Song> findById(Long id);
}

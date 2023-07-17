package org.example;

import java.util.List;
import java.util.Optional;

public interface SongRepository {

    List<Song> findAll();

    //    @Query("SELECT s FROM Song s WHERE s.id =:id")
    Optional<Song> findById(Long id);

    //    @Modifying
//    @Query("DELETE FROM Song s WHERE s.id = :id")
    void deleteById(Long id);

    void updateById(Long id, Song newSong);

    Song save(Song song);

    boolean existsById(Long id);
}

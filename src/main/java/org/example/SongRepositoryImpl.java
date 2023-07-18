package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SongRepositoryImpl implements SongRepository {

    EntityManager entityManager = Persistence.createEntityManagerFactory("myPersistenceUnit")
            .createEntityManager();

    @Override
    public List<Song> findAll() {
        Query query = entityManager.createQuery("Select s From Song s");
        List<Song> song = query.getResultList();
        return song;
    }

    @Override
    public Optional<Song> findById(Long id) {
        Query query = entityManager.createQuery("Select s From Song s Where id=:id");
        query.setParameter("id", 1L);
        Song song = (Song) query.getSingleResult();
        return Optional.ofNullable(song);
    }
}

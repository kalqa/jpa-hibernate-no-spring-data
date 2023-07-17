package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        SongRepository repository = context.getBean(SongRepository.class);
        Song song = repository.findById(1L).get();
        System.out.println(song.getId());
        System.out.println(song.getName());
        System.out.println(song.getArtist());

        List<Song> all = repository.findAll();
        all.forEach(System.out::println);
    }
}

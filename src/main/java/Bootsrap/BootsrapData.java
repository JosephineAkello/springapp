package Bootsrap;

import java.awt.*;
import java.awt.print.Book;
import java.util.Optional;

import Repository.AuthorRepository;
import Repository.BookRepository;
import model.Authors;
import model.Books;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.S;

@Component
public class BootsrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private Object Iterable;
    private Object Book;
    private Object Example;


    public BootsrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Authors maureen = new Authors("Maureen", " Jos");
        Books ddd = new Books("Domain Driven Design", "123123");
        maureen.getBooks().add(ddd);
        ddd.getAuthors().add(maureen);

        authorRepository.save(maureen);
        bookRepository.save(ddd);

        Authors jos = new Authors("Jos", "Josephine");
        Books jjj = new Books("know your lang", "120120");
        jos.getBooks().add(jjj);
        jjj.getAuthors().add(jos);

        authorRepository.save(jos);
        bookRepository.save(jjj);




    }
}

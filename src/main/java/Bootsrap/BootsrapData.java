package Bootsrap;

import Repository.AuthorRepository;
import Repository.BookRepository;
import model.Authors;

import model.Books;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class BootsrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;



    public BootsrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Authors maureen = new Authors("Maureen", " Jos");
        Books ddd = new Books("domain driven design", "123123");
        maureen.getBooks().add(ddd);
        ddd.getAuthors().add(maureen);

      authorRepository.save(maureen);
      bookRepository.save(ddd);


        Authors jos = new Authors("Jos", "Josephine");
        Books jjj = new Books("know your language", "120120");
       jos.getBooks().add(jjj);
        jjj.getAuthors().add(jos);

        authorRepository.save(jos);
        bookRepository.save(jjj);





    }
}

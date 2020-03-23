package com.example.springapp.Bootsrap;

import com.example.springapp.Repository.AuthorRepository;
import com.example.springapp.Repository.BookRepository;
import com.example.springapp.Repository.PublisherRepository;
import com.example.springapp.model.Authors;

import com.example.springapp.model.Books;
import com.example.springapp.model.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class BootsrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;



    public BootsrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("SFG publishers");
        publisher.setCity("St Petersburg");
        publisher.setState("KE");

        publisherRepository.save(publisher);

        System.out.println("Publisher count: " + publisherRepository.count());

        Authors maureen = new Authors("Maureen", " Jos");
        Books ddd = new Books("domain driven design", "123123");
        maureen.getBooks().add(ddd);
        ddd.getAuthors().add(maureen);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(maureen);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);


        Authors jos = new Authors("Jos", "Josephine");
        Books jjj = new Books("know your language", "120120");
       jos.getBooks().add(jjj);
        jjj.getAuthors().add(jos);

        jjj.setPublisher(publisher);
        publisher.getBooks().add(jjj);

        authorRepository.save(jos);
        bookRepository.save(jjj);
        publisherRepository.save(publisher);

      System.out.println("Started in Bootstrap");
      System.out.println("Number of Books" + bookRepository.count());
      System.out.println("Publisher Number of Books " + publisher.getBooks().size());



    }
}

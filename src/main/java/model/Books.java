package model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
    public class Books {

       @Id
       @GeneratedValue(strategy = GenerationType.AUTO )
        private Long id;
        private String title;
        private String isbn;
        private String publisher;

        @ManyToMany
        private Set<Authors> authors = new HashSet<>();
        public  Books(){

        }
        public  Books(String title, String isbn, String publisher){
            this.title = title;
            this.isbn = isbn;
            this.publisher = publisher;
        }

        public  Books(String title, String isbn, String publisher, Set<Authors> authors){
            this.title = title;
            this.isbn = isbn;
            this.publisher = publisher;
            this.authors =  authors;
        }

        public String getTitle(){
            return title;
        }
        public  void setTitle(String title){
            this.title = title;
        }

        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn){
            this.isbn = isbn;
        }
        public String getPublisher() {
            return publisher;
        }
        public void setPublisher(String publisher){
            this.publisher = publisher;
        }

        public Set<Authors> getAuthors() {
            return authors;
        }

        public void setAuthors(Set<Authors> authors) {
            this.authors = authors;
        }
    }


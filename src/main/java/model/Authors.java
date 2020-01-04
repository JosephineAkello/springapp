package model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Authors{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;

    @ManyToMany
    private Set<Books> books = new HashSet<>();

    public Authors() {

    }

    public Authors(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.books = books;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
            return firstname;
        }
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }



        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public Set<Books> getBooks() {
            return books;
        }

        public void setBooks(Set<Books> books) {
            this.books = books;
        }
    }


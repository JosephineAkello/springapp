package com.example.springapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Authors {
    @ManyToMany(mappedBy = "authors")
    private Set<Books> books = new HashSet<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long       id;
    private String     firstname;
    private String     lastname;

    public Authors() {}

    public Authors(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname  = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Authors)) {
            return false;
        }

        Authors authors = (Authors) o;

        return (id != null)
               ? id.equals(authors.id)
               : authors.id == null;
    }

    @Override
    public int hashCode() {
        return (id != null)
               ? id.hashCode()
               : 0;
    }

    @Override
    public String toString() {
        return "Authors{" + "id=" + id + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\''
               + ", books=" + books + '}';
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

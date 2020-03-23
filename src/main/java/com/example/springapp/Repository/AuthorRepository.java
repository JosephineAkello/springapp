package com.example.springapp.Repository;

import com.example.springapp.model.Authors;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Authors, Long>{
}

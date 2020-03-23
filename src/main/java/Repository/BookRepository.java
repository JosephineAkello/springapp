package Repository;


import model.Books;
import org.springframework.data.repository.CrudRepository;

//firt param takes type, then value
public interface BookRepository extends CrudRepository<Books, Long> {
}

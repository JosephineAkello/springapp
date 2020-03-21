package Repository;

import model.Authors;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Authors, Long>{
}

package repository;

import model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
    Iterable<Book> findAllByNameContaining(String name);
}

package service;

import model.Book;

public interface BookService {
    Iterable<Book> findAll();
    Book findById(int id);
    void save(Book book);
    void remove(int id);
    Iterable<Book> findAllByNameContaining(String name);

}

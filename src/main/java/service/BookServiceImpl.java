package service;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BookRepository;

public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        Iterable<Book> books = bookRepository.findAll();
        System.out.println(books);
        return books;
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findOne(id);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void remove(int id) {
        bookRepository.delete(id);
    }

    @Override
    public Iterable<Book> findAllByNameContaining(String name) {
        return bookRepository.findAllByNameContaining(name);
    }
}

package model;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book implements Cloneable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Book() {
    }

    public Book(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book(Integer id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Book(Integer id, String name, String author, Category category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}

package service;

import model.Category;

public interface CategoryService {
   Category findById(int id);
   Iterable<Category> findAll();
}

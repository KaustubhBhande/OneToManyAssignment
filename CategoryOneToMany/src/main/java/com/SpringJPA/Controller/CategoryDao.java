package com.SpringJPA.Controller;
import org.springframework.data.repository.CrudRepository;
public interface CategoryDao extends CrudRepository<Category,Integer> {
public Category findById(int id);
}

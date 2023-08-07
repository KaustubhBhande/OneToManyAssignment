package com.SpringJPA.Controller;
import org.springframework.data.repository.CrudRepository;
public interface ProductDao extends  CrudRepository<Product,Integer> {
public Product findById(int id);
}

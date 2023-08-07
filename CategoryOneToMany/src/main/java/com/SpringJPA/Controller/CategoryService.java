package com.SpringJPA.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoryService {
@Autowired
private CategoryDao categoryDao;
public List<Category> GetAllCategory(){
List<Category> list=(List<Category>) this.categoryDao.findAll();
return list;	
}
public Category GetCategory(int id) {
return this.categoryDao.findById(id);
}
public Category AddCategory(Category category) {
return this.categoryDao.save(category);
}
public void DeleteCategory(int id) {
this.categoryDao.deleteById(id);	
}
public Category UpdateCategory(int id,Category category) {
category.setId(id);
return this.categoryDao.save(category);
}
}

package com.SpringJPA.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CategoryController {
@Autowired
private CategoryService categoryService;
@GetMapping("/category")
public List<Category> GetAllCategories(){
return this.categoryService.GetAllCategory();
}
@GetMapping("/category/{id}")
public Category GetCategory(@PathVariable ("id") int id) {
return this.categoryService.GetCategory(id);
}
@PostMapping("/category")
public Category AddCategory(@RequestBody Category category) {
return this.categoryService.AddCategory(category);
}
@DeleteMapping("/category/{id}")
public void DeleteCategory(@PathVariable ("id") int id) {
this.categoryService.DeleteCategory(id);
}
@PutMapping("/category/{id}")
public Category UpdateCategory(@PathVariable ("id") int id,@RequestBody Category category) {
return this.categoryService.UpdateCategory(id, category);
}
}

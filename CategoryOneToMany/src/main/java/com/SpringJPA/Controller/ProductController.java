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
public class ProductController {
@Autowired
private ProductService productService;
@GetMapping("/product")
public List<Product> GetAllProducts(){
return this.productService.GetAllProducts();
}
@GetMapping("/product/{id}")
public Product GetProduct(@PathVariable ("id") int id) {
return this.productService.GetProduct(id);
}
@PostMapping("/product")
public Product AddProduct(@RequestBody Product product) {
return this.productService.AddProduct(product);
}
@DeleteMapping("/product/{id}")
public void DeleteProduct(@PathVariable ("id") int id) {
this.productService.DeleteProduct(id);
}
@PutMapping("/product/{id}")
public Product UpdateProduct(@PathVariable ("id") int id,@RequestBody Product product) {
return this.productService.UpdateProduct(id, product);
}
}

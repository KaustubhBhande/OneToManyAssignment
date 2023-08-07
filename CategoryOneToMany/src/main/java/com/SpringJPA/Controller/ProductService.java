package com.SpringJPA.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
@Autowired
private ProductDao productDao;
public List<Product> GetAllProducts(){
List<Product> list=(List<Product>) this.productDao.findAll();
return list;	
}
public Product GetProduct(int id) {
return this.productDao.findById(id);
}
public Product AddProduct(Product product) {
return this.productDao.save(product);
}
public void DeleteProduct(int id) {
this.productDao.deleteById(id);	
}
public Product UpdateProduct(int id,Product product) {
product.setId(id);
return this.productDao.save(product);
}
}

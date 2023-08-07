package com.SpringJPA.Controller;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private String description;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", description=" + description + "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String name, String description) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
}
public void setDescription(String description) {
	this.description = description;
}
}
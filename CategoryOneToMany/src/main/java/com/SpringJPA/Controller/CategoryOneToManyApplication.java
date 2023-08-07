package com.SpringJPA.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages="com.SpringJPA.Controller")
public class CategoryOneToManyApplication {
public static void main(String[] args) {
SpringApplication.run(CategoryOneToManyApplication.class, args);
}
}

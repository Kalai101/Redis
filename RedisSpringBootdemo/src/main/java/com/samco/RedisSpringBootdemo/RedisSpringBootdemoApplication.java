package com.samco.RedisSpringBootdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.RedisSpringBootdemo.Entity.Product;
import com.samco.RedisSpringBootdemo.Repository.ProductDao;

@SpringBootApplication
public class RedisSpringBootdemoApplication {

	
	@SpringBootApplication
	@RestController
	@RequestMapping("/product")
	public class SpringDataRedisExampleApplication {
	    @Autowired
	    private ProductDao dao;

	    @PostMapping
	    public Product save(@RequestBody Product product) {
	        return dao.save(product);
	    }

	    @GetMapping
	    public List<Product> getAllProducts() {
	        return dao.findAll();
	    }

		/*
		 * @GetMapping("/{id}") public Product findProduct(@PathVariable int id) {
		 * return dao.findProductById(id); }
		 * 
		 * @DeleteMapping("/{id}") public String remove(@PathVariable int id) { return
		 * dao.deleteProduct(id); }
		 */
	    


	public static void main(String[] args) {
		SpringApplication.run(RedisSpringBootdemoApplication.class, args);
	}

}
}

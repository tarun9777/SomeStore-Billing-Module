package com.capstore.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capstore.app.models.Cart;
import com.capstore.app.models.CommonFeedback;
import com.capstore.app.models.CustomerDetails;
import com.capstore.app.models.MerchantDetails;
import com.capstore.app.models.Product;
import com.capstore.app.models.User;
import com.capstore.app.repository.Dao;

@SpringBootApplication
public class BillingApplication implements CommandLineRunner {

	@Autowired
	Dao dao;
	public static void main(String[] args) {
		SpringApplication.run(BillingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Product p = new Product();
		p.setProductId(1);
		p.setProductName("saafs");
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setProductName("saafs");
		Product p2 = new Product();
		p2.setProductId(2);
		p2.setProductName("sfs");
		
		MerchantDetails md = new MerchantDetails();
		Set<Product> mPro = new HashSet<>();
		mPro.add(p1);
		mPro.add(p2);
		md.setProducts(mPro);
		
		dao.save(md);
		
		
		
		CustomerDetails user2 = new CustomerDetails();
		user2.setName("asde");
		user2.setUsername("sf");
		user2.setPassword("abc");
		user2 = dao.save(user2);
		
		Cart customerCart = new Cart();
		customerCart.setCartId(1);
		customerCart.setUserID(user2.getUserId());
		List<Product> products = new ArrayList<>();
		products.add(p);
		products.add(p1);
		products.add(p2);
		customerCart.setProducts(products);
		//System.out.println(customerCart.getProducts().size());
		user2.setCustomerCart(customerCart);
		//System.out.println(user2.getCustomerCart());
		dao.save(user2);
		System.out.println(user2.getCustomerCart());
		
//		User u = dao.findById(user2.getUserId()).get();
//		
//		CustomerDetails cd = (CustomerDetails) user2;
//		Cart retrivedCart =  cd.getCustomerCart();
		
//		int quantity =0;
//		for(Product s : user2.getCustomerCart().getProducts()) {
//			if(s.getProductId() == 1)
//				quantity++;
//		}
		System.out.println(user2.getCustomerCart().getProducts());
		
	}

}

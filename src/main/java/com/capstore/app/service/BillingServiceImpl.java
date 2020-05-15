package com.capstore.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstore.app.models.Product;
import com.capstore.app.repository.ProductRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private ProductRepository productRepo;
	
	
	@Override
	public void applyDiscount(int productID) {
		Product pTemp;
		
		Optional<Product> temp = productRepo.findById(productID);
		if(temp.isPresent()) {
			pTemp=temp.get();
			double discount = pTemp.getDiscount();
			double originalPrice = pTemp.getProductPrice();
			double discountedPrice = originalPrice * (1-discount/100);
			pTemp.setProductPrice(discountedPrice);
			productRepo.save(pTemp);
			System.out.println("Discount Applied Successfully");
		}
		else {
			System.out.println("Invalid Product ID");
		}
		
		
		
		
		
		
	}

}

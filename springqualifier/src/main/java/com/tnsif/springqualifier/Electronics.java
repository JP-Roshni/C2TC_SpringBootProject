package com.tnsif.springqualifier;

import org.springframework.stereotype.Component;

@Component
public class Electronics implements ShoppingMall{
	public void purchase() {
		System.out.println("im going to purchase widgets");
	}
}

package com.tnsif.springioc;

import org.springframework.stereotype.Component;

@Component
public class Customer1 {
	private int cid;
	private String name;
	private String city;
	public Customer1() {
		System.out.println("Customer class 1 object has been created..");
	}
	public void order() {
		System.out.println("Customer 1 ordering the product..");
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

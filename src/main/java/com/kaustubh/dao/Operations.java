package com.kaustubh.dao;

import java.util.HashSet;
import java.util.Set;

import com.kaustubh.model.Product;

public class Operations {

	Set<Product> products=new HashSet<Product>();
	
	public boolean addProduct(Product P)
	{
		return products.add(P);
	}
}

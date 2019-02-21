package com.kaustubh.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class GenerateBill {
		
	public static double calTax(double price,String cat)
	{	
		double tax=0.0;
		if(cat.equals("A"))
			tax=price*0.10;
		else if(cat.equals("B"))
			tax=price*0.20;
		else
			tax=0.0;
		
	return tax;
		
	}
	
	public static void main(String[] args) {
		

		double total=0.00;
		double salestax=0.00;
		double totaltax=0.00;
		
		List<Product> elements=new ArrayList<Product>();
		Product pr=new Product("Apples",200,"A");
		Product pr1=new Product("Biscuits",50,"B");
		Product pr2=new Product("poppers",100,"B");
		Product pr3=new Product("Broomstick",450,"C");
		Product pr4=new Product("Brushes",120,"C");
		Product pr5=new Product("Butter",60,"C");
		Product pr6=new Product("Crackers",80,"A");
		Product pr7=new Product("Spices",98,"A");
		
		elements.add(pr);
		elements.add(pr1);elements.add(pr2);elements.add(pr3);
		elements.add(pr4);elements.add(pr5);elements.add(pr6);
		elements.add(pr7);
		
		System.out.println("------------------------------------------");
		System.out.println(String.format("%8s    %-6s   %10s","Item","Price","SalesTax"));
		
		System.out.println("------------------------------------------");
		
		
		for(Product p:elements)
		{
			salestax=GenerateBill.calTax(p.getPrice(),p.getCategory());
			System.out.println(String.format("%10s  Rs.%-6.2f  Rs.%-5s",p.getName()  ,p.getPrice() ,salestax));
			total=total+p.getPrice()+salestax;
			totaltax=totaltax+salestax;
		}
		System.out.println("------------------------------------------");
		System.out.println("   Total    Rs."+total+"  Rs."+totaltax);
		System.out.println("(Inc of taxes)");
	
	}
}

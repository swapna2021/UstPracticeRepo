package com.ust.OverloadingDemo;

import java.util.logging.Logger;

public class Calculator {
	
	public static Logger logger=Logger.getLogger(Calculator.class.getName());
	
	
	
	public int add(int i1,int i2) {
		logger.info("add method with 2 int parameters invoked");
		return i1+i2;
	}

	public double add(double d1,double d2) {
		return d1+d2;
	}
	
	public String add(String s1,String s2) {
		return s1+s2;
	}
	
	public int add(int i1,int i2,int i3) {
		return i1+i2+i3;
	}
	
	public String add(String s1,String s2,String s3,String s4) {
		return s1+s2+s3+s4;
	}
	
	public double add(int i,double d) {
		return i+d;
		
	}
	
	public double add(double d,int i) {
		return d+i;
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		logger.info(c.add("a","b","c","d"));
		logger.info("Result:"+c.add(3, 4));
		logger.info("Result:"+ c.add(78.90,56.78));
		logger.info("Result:"+c.add("Swapna ", "Motupally"));
		logger.info("Result:"+c.add(45, 56.79));
	}

}

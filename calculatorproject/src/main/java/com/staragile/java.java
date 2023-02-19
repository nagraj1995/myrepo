package com.staragile;
import com.staragile.Calculator;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Welcome to calculator project");
        Calculator obj = new Calculator();
        System.out.println(obj.sum(40, 20));
        System.out.println(obj.minus(40, 20));
        System.out.println(obj.multiply(40, 20));
        System.out.println(obj.divide(40, 20));
	}

}

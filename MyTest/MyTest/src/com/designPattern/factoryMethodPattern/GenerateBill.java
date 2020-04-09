package com.designPattern.factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GenerateBill {

	public static void main(String[] args) throws IOException {

		PlanFactory planFactory = new PlanFactory();
		
		System.out.println("Enter the plan to generate bill");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planType =br.readLine();
		System.out.println("Enter number of units");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planType);
		
		System.out.println("Bill amount for "+planType +" for units "+units);
		p.getRate();
		p.calculateBill(units);
	}

}

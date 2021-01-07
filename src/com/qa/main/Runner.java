package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		// creating a new instance of Results
		Results student1 = new Results(99, 125, 76);
		
		// printing the new Results instance's total
		System.out.println(student1.getTotal());
		
		//printing the new Results instance's percentage
		System.out.println(student1.percentagecalc());
	}

}

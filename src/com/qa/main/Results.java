package com.qa.main;

public class Results {
	
	// variables
	int physics;
	int chemistry;
	int biology;
	double total;
	double percentage;
	
	//methods
	public Results(int phyMark, int chemMark, int bioMark) {
		this.physics = phyMark;
		this.chemistry = chemMark;
		this.biology = bioMark;
		this.total = (double) phyMark + chemMark + bioMark;
	}
	
	public double getTotal() {
		return total;
	}
	
	public float percentagecalc() {
		float result = (float) (this.total/450);
		return result*100;
	}

}

package com.pgs.hopek.androidtesstgit.renamed;

public class NewClass {
	
	private int INITIAL_VALUE;
	
	public NewClass() {
		INITIAL_VALUE = 456;
	}

	private void setInitialValue(int newValue) {
		INITIAL_VALUE = newValue;
	}
	
	private void conflictMethod01() {
		int a = 234;
		int newV2 = 456;
		a --;
	}
}

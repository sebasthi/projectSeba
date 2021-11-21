package org.test;

public class OddOrEven {

	private int EvenOrOdd(int a) {
		if (a%2==0) {
			System.out.println("it is a even number"+a);
		}
		else {
			System.out.println("it is odd number"+a);
		
	}
		return a;
	}
	
	public static void main(String[] args) {
		OddOrEven ans=new OddOrEven();
		ans.EvenOrOdd(11);
		
	}
	
	
}

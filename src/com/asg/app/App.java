package com.asg.app;

public class App {

	public static void main(String[] args) {
		
		int num = 6;
		showReversedMountainPattern(num);
		
	}
	
	private static void showReversedMountainPattern(int num) {
		
		for(int i = num; i >= 1; i--) {
			
			for (int k = 1; k <= num - i; k++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}
}

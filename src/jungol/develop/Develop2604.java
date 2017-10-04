package jungol.develop;

import java.util.Scanner;

public class Develop2604 {
	
	static String dishStack;
	
	public static void main(String[] args) {
		getData();
		work();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		dishStack = sc.next();
		sc.close();
	}
	
	public static void work() {
		int height = 10;
		
		for(int i = 1; i < dishStack.length(); i++) {
			if(dishStack.charAt(i-1) == dishStack.charAt(i))
				height += 5;
			else
				height += 10;
		}
		
		System.out.println(height);
	}
}

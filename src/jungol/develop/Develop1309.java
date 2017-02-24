package jungol.develop;

import java.util.Scanner;

public class Develop1309 {
	static int n;

	public static void main(String[] args) {
		getData();
		printText(n);
		System.out.format("%.0f",factorial(n));
	}

	public static void getData(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
	}
	
	public static double factorial(int n) {
		if(n==1) return 1;
		else return n*factorial(n-1);
	}
	
	public static void printText(int n) {
		for(int i=n; i>1; i--)
			System.out.println(i+"! = "+i+" * "+(i-1)+"!"); 
		System.out.println("1! = 1");
	}
}

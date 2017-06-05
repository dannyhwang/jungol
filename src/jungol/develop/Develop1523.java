package jungol.develop;

import java.util.Scanner;

public class Develop1523 {

	static int n, m;
	
	public static void main(String[] args) {
		getData();
		work();
	}

	public static void getData() {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		if(n < 1 || n > 100 || m < 1 || m > 3) {
			System.out.println("INPUT ERROR!");
			System.exit(-1);
		}
		sc.close();
	}
	
	public static void work() {
		switch(m) {
		case 1 :
			for(int i=0; i<n; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			break;
		case 2 :
			for(int i=0; i<n; i++) {
				for(int j=0; j<n-i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			break;
		case 3 :
			for(int i=0; i<n; i++) {
				for(int j=0; j<n-i-1; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<1+2*i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			break;
		}
	}
}

package jungol.develop;

import java.util.Scanner;

public class Develop1341 {
	
	static int S, E;
	
	public static void main(String[] args) {
		getData();
		
		if(S<=E) workInc();
		if(S>E) workDec();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
		E = sc.nextInt();
		sc.close();
	}
	
	public static void workInc() {
		for(int i=S; i<=E; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print("" + i + " * " + j + " = " + String.format("%2d",i*j));
				if(j%3 == 0 && j != 9) System.out.print("\n");
				if(j%3 != 0) System.out.print("   ");
				if(j == 9) System.out.print("\n\n");
			}
		}
	}

	public static void workDec() {
		for(int i=S; i>=E; i--) {
			for(int j=1; j<=9; j++) {
				System.out.print("" + i + " * " + j + " = " + String.format("%2d",i*j));
				if(j%3 == 0 && j != 9) System.out.print("\n");
				if(j%3 != 0) System.out.print("   ");
				if(j == 9) System.out.print("\n\n");
			}
		}
	}
}

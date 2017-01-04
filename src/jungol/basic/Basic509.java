package jungol.basic;

import java.util.Scanner;

public class Basic509 {

	public static int n;
	
	public static void main(String[] args) {
		getData();
		System.out.print(n);
	}

	public static void getData(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
	}
}

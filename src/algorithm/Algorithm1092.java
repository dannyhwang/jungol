package algorithm;

import java.util.Scanner;

public class Algorithm1092 {
	static int X, Y;
	static double result = 1;
	
	public static void main(String[] args) {
		getData();
		work();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		sc.close();
	}
	
	public static void work() {
		if(Y==0) result = 1;
		
		X = X % 20091024;
		
		for(int i=0; i<Y; i++) {
			result = (result * X) % 20091024;
		}
		
		System.out.println(String.format("%.0f",result));
	}	
}

package jungol.develop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Develop1402 {

	static int N, K;
	static List<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		getData();
		work();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		sc.close();
	}
	
	public static void work() {
		for(int i = 1; i <= N; i++) {
			if( N % i == 0 ) result.add(i);
		}
		
		if(K <= result.size())
			System.out.println(result.get(K - 1));
		else
			System.out.println("0");
	}
}

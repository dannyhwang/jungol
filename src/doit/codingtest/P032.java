package doit.codingtest;

import java.util.Scanner;

/**
 * P032
 * https://www.acmicpc.net/problem/11047
 * @author Danny
 * 
 */

public class P032 {
	
	static int N, K;
	static int[] coinList;
	
	public static void main(String[] args) {
		getData();
		
		int remain = K;
		int coinCount=0;
		
		for(int i=N-1; i>=0; i--) {		
			if(remain/coinList[i] > 0) {
				coinCount += remain/coinList[i];
				remain = remain%coinList[i];
			}
			if(remain==0)
				break;
		}
		System.out.println(coinCount);
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		coinList = new int[N];
		
		for(int i=0; i<N; i++) {
			coinList[i] = sc.nextInt();
		}
		sc.close();
	}
}
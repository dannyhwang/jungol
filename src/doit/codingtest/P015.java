package doit.codingtest;

import java.util.Scanner;

/**
 * Bubble Sort, O(n^2)
 * https://www.acmicpc.net/problem/2750
 * @author Danny
 *
 */

public class P015 {

	static int N;
	static int[] numlist;
	
	public static void main(String[] args) {
		getData();
		
		for(int i=N-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(numlist[j]>numlist[j+1]) {
					int temp = numlist[j];
					numlist[j] = numlist[j+1];
					numlist[j+1] = temp;
				}
			}
		}
		
		printData();
	}
	
	static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numlist = new int[N];
		for(int i=0; i<N; i++) {
			numlist[i] = sc.nextInt();
		}
		sc.close();
	}
	
	static void printData() {
		for(int i=0; i<N; i++) {
			System.out.println(numlist[i]);
		}		
	}
}

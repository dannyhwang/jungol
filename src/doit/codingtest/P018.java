package doit.codingtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * P018
 * https://www.acmicpc.net/problem/11399
 * @author Danny
 * 
 */

public class P018 {
	
	static int N;
	static int[] numArray;
	
	public static void main(String[] args) {
		getData();
		
		Arrays.sort(numArray);
		
		int sum = 0;
		int time = 0;
		
		for(int num:numArray) {
			time += num;
			sum += time; 
		}
		
		System.out.println(sum);
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numArray = new int[N];
		
		for(int i=0; i<N; i++) {
			numArray[i] = sc.nextInt();
		}
		sc.close();
	}
}
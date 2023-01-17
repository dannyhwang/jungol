package doit.codingtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * P029
 * https://www.acmicpc.net/problem/1920
 * @author Danny
 * 
 */

public class P029 {
	
	static int N, M;
	static int[] nArray, mArray;
	
	public static void main(String[] args) {
		
		getData();
		
		Arrays.sort(nArray);
		
		for(int i=0; i<M; i++) {
			System.out.println(Arrays.binarySearch(nArray, mArray[i])>=0?1:0);
		}
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		nArray = new int[N];
		for(int i=0; i<N; i++)
			nArray[i] = sc.nextInt();
		
		M = sc.nextInt();
		mArray = new int[M];
		for(int i=0; i<M; i++)
			mArray[i] = sc.nextInt();
		
		sc.close();
	}
}
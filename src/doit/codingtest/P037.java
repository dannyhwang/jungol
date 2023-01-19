package doit.codingtest;

import java.util.Scanner;

/**
 * P037
 * https://www.acmicpc.net/problem/1929
 * @author Danny
 * 
 */

public class P037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		
		int[] primeNumbers = new int[N+1];
		for(int i=0; i<N+1; i++)
			primeNumbers[i] = i;
		
		primeNumbers[1] = 0;
		
		for(int i=2; i<=Math.sqrt(N); i++) {
			for(int j=i*2; j<=N; j+=i) {
				primeNumbers[j] = 0;
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(primeNumbers[i] != 0)
				System.out.println(primeNumbers[i]);
		}
	}
}
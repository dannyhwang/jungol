package doit.codingtest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * P038
 * https://www.acmicpc.net/problem/1747
 * @author Danny
 * 
 */

public class P039 {

	static int N;
	static int primeNumbers[] = new int[10000001];
	
	public static void main(String[] args) {
		getData();
		
		for(int i=0; i<10000001; i++)
			primeNumbers[i] = i;
		
		for(int i=2; i<=Math.sqrt(10000000); i++) {
			for(int j=2*i; j<10000001; j+=i)
				primeNumbers[j] = 0;
		}
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int i=2; i<10000001; i++)
			if(primeNumbers[i]!=0)
				primes.add(primeNumbers[i]);
		
		for(int prime:primes) {
			if(prime>=N) {
				boolean isPP = true;
				String primeString = Integer.toString(prime);
				for(int k=0; k<primeString.length()/2; k++) {
					if( primeString.charAt(k) != primeString.charAt(primeString.length()-1-k) ) {
						isPP = false;
						break;
					}
				}
				
				if(isPP) {
					System.out.println(primeString);
					break;
				}
			}
		}
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
	}
}
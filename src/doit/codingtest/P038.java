package doit.codingtest;

import java.util.Scanner;

/**
 * P038
 * https://www.acmicpc.net/problem/1456
 * @author Danny
 * 
 */

public class P038 {

	static double A, B;
	static int[] primeNumbers;
	
	public static void main(String[] args) {
		getData();
		int sqrtNum = (int) Math.sqrt(B);
		int sqrtSqrtNum = (int) Math.sqrt(Math.sqrt(B));
		primeNumbers = new int[sqrtNum+1];
		
		for(int i=0; i<=sqrtNum; i++) {
			primeNumbers[i] = i;
		}
		
		for(int i=2; i<=sqrtSqrtNum; i++) {
			for(int j=i*2; j<=sqrtNum; j+=i) {
				primeNumbers[j] = 0;
			}
		}
		
		int nearPrimeCount = 0;
		
		for(int i=2; i<sqrtNum+1; i++) {
			if(primeNumbers[i] != 0) {
				long temp = primeNumbers[i];
				while((double)primeNumbers[i] <= (double)B/(double)temp) {
					if((double)primeNumbers[i] >= (double)A/(double)temp) {
						nearPrimeCount++;
					}
					temp = temp * primeNumbers[i];
				}
			}				
		}
		System.out.println(nearPrimeCount);
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		sc.close();
	}
}
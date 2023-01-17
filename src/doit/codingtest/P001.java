package doit.codingtest;

import java.util.Scanner;

/**
 * P001
 * https://www.acmicpc.net/problem/11720
 * @author Danny
 *
 */

public class P001 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		String numString = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<length; i++) {
			sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}

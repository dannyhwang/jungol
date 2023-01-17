package doit.codingtest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 배열 역순 정렬
 * https://www.acmicpc.net/problem/1427
 * @author Danny
 * 
 */

public class P017 {
	
	static String numString;
	static int[] numArray;
	
	public static void main(String[] args) {
		getData();
		
		Integer[] integerArray = Arrays.stream(numArray).boxed().toArray(Integer[]::new);
		
		Arrays.sort(integerArray, Collections.reverseOrder());
		
		for(int num:integerArray)
			System.out.print(num);
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		numString = sc.next();
		numArray = new int[numString.length()];
		
		for(int i=0; i<numString.length(); i++)
			numArray[i] = Integer.parseInt( String.valueOf(numString.charAt(i)) );
		sc.close();
	}
}

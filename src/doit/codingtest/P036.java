package doit.codingtest;

import java.util.Scanner;

/**
 * P036
 * https://www.acmicpc.net/problem/1541
 * @author Danny
 * 
 */

public class P036 {
	static String numString;
	
	public static void main(String[] args) {
		getData();
		
		String[] numStrArray = numString.split("[+]|-");
		String[] signStrArray = numString.replaceAll("[\\d]","").split("");
		boolean isMinus = false;
		
		int answer = Integer.parseInt(numStrArray[0]);
		
		for(int i=0; i<numStrArray.length-1; i++) {
			if(signStrArray[i].equals("-"))
				isMinus = true;
			if(isMinus)
				answer -= Integer.parseInt(numStrArray[i+1]);
			else 
				answer += Integer.parseInt(numStrArray[i+1]);
		}
		
		System.out.println(answer);
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		numString = sc.next();
		sc.close();
	}
}
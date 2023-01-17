package doit.codingtest;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * P002
 * https://www.acmicpc.net/problem/1546
 * @author Danny
 *
 */

public class P002 {
	
	static int cnt;
	static ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		getData();
		
		long sum = 0;
		long max = Collections.max(nums);
		
		for(int i=0; i<cnt; i++)
			sum += nums.get(i);
		System.out.println(sum*100.0/max/cnt);
		
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			nums.add(sc.nextInt());
		}
		
		sc.close();
	}
}
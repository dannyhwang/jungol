package doit.codingtest;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * P003
 * https://www.acmicpc.net/problem/11659
 * @author Danny
 *
 */

public class P003 {

	static int N, M;
	static ArrayList<Integer> nums = new ArrayList<Integer>();
	static ArrayList<Integer> cumulatedSum = new ArrayList<Integer>();
	static int startNum, endNum;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		nums.add(0);
		cumulatedSum.add(0);
		
		for(int i=0; i<N; i++) {
			nums.add(sc.nextInt());			
		}
		
		for(int i=1; i<=N; i++) {
			cumulatedSum.add(cumulatedSum.get(i-1)+nums.get(i));
		}
		
		for(int j=0; j<M; j++) {
			int fromNum = sc.nextInt();
			int toNum = sc.nextInt();
			System.out.println(cumulatedSum.get(toNum)-cumulatedSum.get(fromNum-1));
		}
		
		sc.close();
	}
}

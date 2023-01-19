package doit.codingtest;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * P033
 * https://www.acmicpc.net/problem/1715
 * @author Danny
 * 
 */

public class P033 {
	
	static int N;
	static PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
	
	public static void main(String[] args) {
		getData();
		
		int compareCount = 0;
		int totalCount = 0;
		
		while(pq.size() > 1) {
			compareCount = pq.remove() + pq.remove();
			totalCount += compareCount;
			pq.add(compareCount);
		}
	
		System.out.println(totalCount);		
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=0; i<N; i++) {
			pq.add(sc.nextInt());
		}
		sc.close();
	}
}


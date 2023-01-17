package doit.codingtest;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

/**
 * https://www.acmicpc.net/problem/2164
 * @author Danny
 *
 */

public class P013 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		while(queue.size()>1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.poll());
	}
}

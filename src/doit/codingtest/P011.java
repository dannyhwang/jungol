package doit.codingtest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


/**
 * https://www.acmicpc.net/problem/1874
 * @author Danny
 *
 */

public class P011 {
	
	static int N;
	static ArrayList<Integer> nums = new ArrayList<Integer>();
	static StringBuffer bf = new StringBuffer();
	static boolean result = true;
	
	public static void main(String[] args) {
		getData();
		
		Stack<Integer> st = new Stack<Integer>();
		int workNum =  1;
		
		for(int num : nums) {
			if( workNum <= num ) {
				while( workNum <= num ) {
					st.push(workNum);
					workNum++;
					bf.append("+\n");					
				}
				st.pop();
				bf.append("-\n");
			} else {
				int popNum = st.pop();
				/* if( popNum > num ) */
				if( popNum != num ) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}			
		}
		
		if(result) System.out.println(bf.toString());		
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=0; i<N; i++) {
			nums.add(sc.nextInt());
		}
		sc.close();
	}
}
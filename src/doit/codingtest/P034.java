package doit.codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * P033
 * https://www.acmicpc.net/problem/1744
 * @author Danny
 * 
 */

public class P034 {

	static int N;
	static PriorityQueue<Integer> plusPQ = new PriorityQueue<Integer>(Collections.reverseOrder());
	static PriorityQueue<Integer> minusPQ = new PriorityQueue<Integer>();
	static PriorityQueue<Integer> zeroPQ = new PriorityQueue<Integer>();
	static ArrayList<Integer> resultArray = new ArrayList<Integer>();
	
	public static void main(String[] args ) {
		getData();
		
		int plusPQSize = plusPQ.size();
		int minusPQSize = minusPQ.size();
		int zeroPQSize = zeroPQ.size();
		
		for(int i=0; i<plusPQSize/2; i++) {
			int num1 = plusPQ.remove();
			int num2 = plusPQ.remove();
			
			if(num1==1 || num2==1) {
				resultArray.add(num1);
				resultArray.add(num2);
			} else {
				resultArray.add(num1 * num2);				
			}
		}
		
		for(int i=0; i<minusPQSize/2; i++)
			resultArray.add(minusPQ.remove() * minusPQ.remove());
		
		for(int i=0; i<zeroPQSize/2; i++)
			resultArray.add(zeroPQ.remove() * zeroPQ.remove());
		
		if(minusPQ.size()==1 && zeroPQ.size()==1) {
			minusPQ.remove();
			zeroPQ.remove();
		}else if(minusPQ.size()==1 && zeroPQ.size()==0) {
			resultArray.add(minusPQ.remove());
		}
		
		if(plusPQ.size()==1)
			resultArray.add(plusPQ.remove());
			
		System.out.println(resultArray.stream().mapToInt(Integer::intValue).sum());
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			if(num>0)
				plusPQ.add(num);
			else if(num<0)
				minusPQ.add(num);
			else
				zeroPQ.add(num);
		}
		sc.close();
	}
}
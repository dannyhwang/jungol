package doit.codingtest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * P023
 * https://www.acmicpc.net/problem/11724
 * @author Danny
 * 
 */

public class P023 {
	
	static int N, M;
	static ArrayList<Integer>[] nodeArray;
	static boolean visited[];
	
	public static void main(String[] args) {
		getData();
		int count = 0;
		
		for(int i=1; i<=N; i++)
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		
		System.out.println(count);
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		nodeArray = new ArrayList[N+1];
		visited= new boolean[N+1];
		
		for(int i=0; i<=N; i++) {
			nodeArray[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			int node1 = sc.nextInt();
			int node2 = sc.nextInt();
			nodeArray[node1].add(node2);
			nodeArray[node2].add(node1);
		}
		
		sc.close();
	}
	
	public static void printData() {
		for(ArrayList<Integer> a:nodeArray)
			System.out.println(a);
		
	}
	
	public static void dfs(int v) {
		if(visited[v])
			return;
		visited[v] = true;
		for(int vv:nodeArray[v])
			if(!visited[vv])
				dfs(vv);
	}
}

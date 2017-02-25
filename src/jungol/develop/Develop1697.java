package jungol.develop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Develop1697 {

	static ArrayList<String> dataList = new ArrayList<String>();
	
	public static void main(String[] args) {
		getData();
		work();
		//printData();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			dataList.add(sc.nextLine());
		}
		sc.close();
	}
	
	public static void work() {
		Queue<String> q = new LinkedList<String>();
		for(int i=0; i<dataList.size(); i++) {
			switch( dataList.get(i).charAt(0) ) {
			case 'i' :
				q.add(dataList.get(i).split(" ")[1]);
				break;
			case 'o' :
				if(q.isEmpty()) System.out.println("empty");
				else System.out.println(q.poll());
				break;
			case 'c' :
				System.out.println(q.size());
				break;
			}
		}
	}
	
	public static void printData() {
		for(int i=0; i<dataList.size(); i++) {
			System.out.println(dataList.get(i));
		}
	}
}

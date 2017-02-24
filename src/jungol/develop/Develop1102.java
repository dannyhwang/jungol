package jungol.develop;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Develop1102 {

	static ArrayList<String> stringList = new ArrayList<String>();
	
	public static void main(String[] args) {
		getData();
		work();
		//printData();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			stringList.add(sc.nextLine());
		}
		sc.close();
	}
	
	public static void work(){
		Stack<String> s = new Stack<String>();
		
		for(int i=0; i<stringList.size(); i++) {
			switch(stringList.get(i).charAt(0)){
			case 'i' :
				s.push(stringList.get(i).split(" ")[1]);
				break;
			case 'o' :
				if(s.size()>0) System.out.println(s.pop());
				else System.out.println("empty");
				break;
			case 'c' :
				System.out.println(s.size());
				break;
			}
		}
	}
	
	public static void printData() {
		for(int i=0; i<stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}
	}
}

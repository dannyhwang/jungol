package doit.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class RecurX2 {

	static void recur(int n) {
		Stack<Integer> s = new Stack<Integer>();
		
		while(true) {
			if(n > 0){
				s.push(n);
				n = n - 1;
				continue;
			}
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		int x = sc.nextInt();
		
		recur(x);
		sc.close();
	}
}

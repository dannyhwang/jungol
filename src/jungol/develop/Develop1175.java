package jungol.develop;

import java.util.Scanner;

public class Develop1175 {

	static int n, m; 
	static int[] diceNumber;
	
	public static void main(String[] args) {
		getData();
		work(0,0);
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		diceNumber = new int[n];
		sc.close();
	}
	
	public static void work(int count, int sum) {
		if(count < n && sum < m) {
			for(int i=1; i<=6; i++){
				diceNumber[count] = i;
				if(sum + i <= m)
					work(count + 1, sum + i);
				else
					break;
			}
		}else if(count == n && sum == m) {
			for(int i=0; i<n; i++){
				System.out.print(diceNumber[i] + " ");
			}
			System.out.println("");
		}
	}
}

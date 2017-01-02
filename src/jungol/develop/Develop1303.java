package jungol.develop;

import java.util.Scanner;

public class Develop1303 {
	
	static int n, m;

	public static void main(String[] args) {
		getData();
		
		int step = 1;
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(step++ + " ");
			}
			System.out.println();
		}
	}

	public static void getData(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
	}
}

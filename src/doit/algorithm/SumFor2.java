package doit.algorithm;

import java.util.Scanner;

public class SumFor2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.print("n��: ");
			n = sc.nextInt();
		} while(n<=0);
		
		sc.close();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
			sum += i;
		
		System.out.printf("1���� %d ������ ���� %d�Դϴ�.", n, sum);
		
	}

}

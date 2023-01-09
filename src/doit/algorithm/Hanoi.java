package doit.algorithm;

import java.util.Scanner;

public class Hanoi {
	
	 
	/**
	 * no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	 *  
	 * @param no
	 * @param x
	 * @param y
	 * 
	 * 기둥 번호를 정수 1,2,3 으로 나타냄 
	 * 기둥 번호의 합이 6이므로 시작 기둥 목표 기둥이 어느 기둥이라도 중간 기둥은 6-x-y 임
	 */
	static void move(int no, int x, int y) {
		if(no>1)
			move(no-1, x, 6-x-y);
		
		System.out.printf("원반[%d]을 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);
		
		if(no>1)
			move(no-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.println("원반의 개수: ");
		int n = sc.nextInt();
		
		move(n,1,3);
		sc.close();
	}
}

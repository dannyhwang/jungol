package doit.algorithm;

import java.util.Scanner;

public class Hanoi {
	
	 
	/**
	 * no���� ������ x�� ��տ��� y�� ������� �ű�
	 *  
	 * @param no
	 * @param x
	 * @param y
	 * 
	 * ��� ��ȣ�� ���� 1,2,3 ���� ��Ÿ�� 
	 * ��� ��ȣ�� ���� 6�̹Ƿ� ���� ��� ��ǥ ����� ��� ����̶� �߰� ����� 6-x-y ��
	 */
	static void move(int no, int x, int y) {
		if(no>1)
			move(no-1, x, 6-x-y);
		
		System.out.printf("����[%d]�� %d�� ��տ��� %d�� ������� �ű�\n", no, x, y);
		
		if(no>1)
			move(no-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.println("������ ����: ");
		int n = sc.nextInt();
		
		move(n,1,3);
		sc.close();
	}
}

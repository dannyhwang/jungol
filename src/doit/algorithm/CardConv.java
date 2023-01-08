package doit.algorithm;

import java.util.Scanner;

/**
 * 
 * @author Danny
 * 
 * 10������ �ٸ� ������ ��ȯ
 */
public class CardConv {
	
	// ������ x�� r������ ��ȯ�Ͽ� �迭d�� �Ʒ��ڸ����� �־� �ΰ� �ڸ����� ��ȯ
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); // r�� ���� ������ ����
			x /= r;
		} while( x != 0 );
		
		// �迭 d�� ���� ���ڿ��� �������� ����
		for( int i=0; i < digits/2; i++ ) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		
		return digits;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;    // ��ȯ�ϴ� ����
		int cd;    // ���
		int dno;   // ��ȯ ���� �ڸ���
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = stdIn.nextInt();
			} while(no<0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36): ");
				cd = stdIn.nextInt();
			} while(cd<2 || cd>36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.println(cd + "������ ");
			for( int i=0; i < dno; i++ )
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�): ");
			retry = stdIn.nextInt();
		} while( retry == 1);
		
		stdIn.close();
	}
}

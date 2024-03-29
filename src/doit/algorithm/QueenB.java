package doit.algorithm;

public class QueenB {
	static int[] pos = new int[8]; // 각 열에 있는 퀸의 위치
	
	// 각 열에 있는 퀸의 위치를 출력
	static void print() {
		for(int i=0; i<8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}

	// i 열에 퀸을 배치, i는 열, j는 행
	static void set(int i) {
		for(int j=0; j<8; j++) {
			pos[i] = j;
			if(i==7) // 모든 열에 배치
				print();
			else
				set(i+1);
			
		}
	}
	
	public static void main(String[] args) {
		set(0); // 0열에 퀸을 배치
	}
}
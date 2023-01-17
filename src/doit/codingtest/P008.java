package doit.codingtest;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * https://www.acmicpc.net/problem/1253
 * @author Danny
 *
 * 자기 자신을 포함하면 안된다는 문제 조건을 주의해야 함
 */


public class P008 {

	static int N;
	static ArrayList<Integer> numList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		getData();
		
		int count = 0;
		
		numList.sort(null);
		
		for(int i=0; i<N; i++) {
			int findNum = numList.get(i);
			int startNum = 0;
			int endNum = N-1;
			
			while(startNum < endNum) {
				
				int sumNum = numList.get(startNum)+numList.get(endNum);
				
				if(sumNum == findNum) {
					if(startNum != i && endNum != i) {
						count++;
						break;						
					} else if (startNum == i) {
						startNum++;
					} else if (endNum == i) {
						endNum--;
					}
				}else if(sumNum < findNum) {
					startNum++;
				}else {
					endNum--;
				}
			}
		}			
				
		System.out.println(count);		
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=0; i<N; i++) {
			numList.add(sc.nextInt());
		}
		sc.close();
	}
}

package doit.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Bubble Sort, 버블 정렬의 Swap이 한 번도 일어나지 않은 루프 수
 * https://www.acmicpc.net/problem/1377
 * @author Danny
 * 
 * Comparable, Comparator 내용 참조
 * https://st-lab.tistory.com/243
 * 
 */

public class P016 {
	
	static int N;
	static Data[] dataArray;
	
	public static void main(String[] args) throws IOException{
		getData();
		
		Arrays.sort(dataArray);
		
		int Max = 0;
		for(int i=0; i<N; i++) {
			if(Max < dataArray[i].index - i)
				Max = dataArray[i].index - i;
		}
		
		System.out.println(Max + 1);
	}
	
	public static void getData() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(reader.readLine());
		dataArray = new Data[N]; 
				
		for(int i=0; i<N; i++) {
			dataArray[i] = new Data(Integer.parseInt(reader.readLine()), i);
		}
		reader.close();
	}
	
	static class Data implements Comparable<Data> {
		int value;
		int index;
		
		public Data(int value, int index) {
			super();
			this.value = value;
			this.index = index;
		}
		
		public int compareTo(Data o) {
			return this.value - o.value;
		}
	}
}
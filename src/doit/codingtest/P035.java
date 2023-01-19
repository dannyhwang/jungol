package doit.codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class P035 {
	
	static int N;
	static ArrayList<MeetingTime> meetingList = new ArrayList<MeetingTime>();
	
	public static void main(String[] args) {
		getData();
		
		meetingList.sort(null);
		
		// System.out.println(meetingList);
		
		int endTime = 0;
		int meetingCount = 0;
		
		for(MeetingTime mt : meetingList) {
			if(mt.startTime >= endTime) {
				endTime = mt.endTime;
				meetingCount++;
			}
		}
		System.out.println(meetingCount);
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int sTime = sc.nextInt();
			int eTime = sc.nextInt();
			
			meetingList.add(new MeetingTime(sTime, eTime));
		}
		
		sc.close();
	}
	
	static class MeetingTime implements Comparable<MeetingTime> {
		int startTime;
		int endTime;
		
		public MeetingTime(int s, int e) {
			super();
			this.startTime = s;
			this.endTime = e;
		}
		
		public int compareTo(MeetingTime m) {
			if(this.endTime > m.endTime)
				return 1;
			else if(this.endTime < m.endTime)
				return -1;
			else if(this.endTime == m.endTime && this.startTime == m.startTime)
				return 0;
			else if(this.endTime == m.endTime && this.startTime > m.startTime)
				return 1;
			else
				return -1;
		}
		
		@Override
		public String toString(){
			return "" + startTime + ":" + endTime;
		}
	}
}

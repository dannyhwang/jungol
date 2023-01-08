package doit.algorithm;

/**
 * 
 * @author Danny
 * 
 * 소수 구하기 2
 */
public class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0; // 나눗셈 횟수
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장한 배열
		
		prime[ptr++] = 2; // 2는 소수인 것으로 미리 지정
		
		for(int n=3; n<=1000; n+=2) { // 검사는 홀수만 수행
			int i;
			for(i=1; i<ptr; i++) {
				counter++;
				if(n%prime[i]==0)
					break;
			}
			if(ptr==i) // 마지막까지 나누어 떨어지지 않음
				prime[ptr++]=n;
		}
		
		for(int i=0; i<ptr; i++)
			System.out.println(prime[i]);
		
		System.out.println("나눗셈을 수행한 횟수: " + counter);
	}
}

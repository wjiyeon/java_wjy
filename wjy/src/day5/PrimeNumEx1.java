package day5;

import java.util.Scanner;

public class PrimeNumEx1 {

	public static void main(String[] args) {
		/*2부터 100이하의 모든 소수를 출력하는 예제
		 * 소수 판별 예제 참고.
		 * 소수 : 약수가 2개인 것
		 * */
		int num = 2;
		int i, count = 0;
		
		while(num <= 100) {
			// 약수는 1부터 num까지
			i=1;
			count=0;
			while(i<=num) {
				if(num%i == 0) {
					count++;
				}
				i++;
			}
			if(count==2) {
				System.out.println(num + " ");
			}
			num++;
		}
		System.out.println(); // 엔터역할
		
		
		int j;
			
		for(j=2;j<=100;j++) {
			for(i=1,count=0 ;i<=j ;i++) {
				if(j % i == 0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(j + " ");
			} 
		}
	}
}

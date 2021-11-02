package day5;

public class DoWhileEx1 {

	public static void main(String[] args) {
		/* do while문을 이용한 Hello 5번 출력 예제*/
		int i = 1;
		do {
			System.out.println("Hello");
			i++;
		}while(i<=5);
		
		
		/* 정수의 초기값이 10부터 시작해서 1씩 증가하면서 5보다 작거나 같은 정수를 출력하는 예제(잘못된 경우 예제)*/
		/* for문, while문은 초기값이 잘못되어 한번도 실행되지 않음.
		 * do while문은 그냥 코드를 작성하면 한번은 실해오디서 원하지 않은 결과가 발생
		 * 그냥 코드 작성 = for문과 while문처럼 실행문을 작성한 경우.
		 */
		
		System.out.println("for문을 이용");
		for(i=10; i<=5; i++) {
			System.out.println(i + " ");
		}
		System.out.println(); 
		System.out.println("do while문을 이용");
		i = 10;
		do {
			System.out.println(i+" ");
			i++;
		}while(i<=5);
		
		

	}

}

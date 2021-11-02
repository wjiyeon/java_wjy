package day5;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {
		/*while문을 이용하여 구구단 7단을 출력하는 코드를 작성하세요.
		 * 
		 * 반복횟수 : i는 1부터 9까지 1씩 증가
		 * 규칙성  : 7 x i = 7*i를 출력
		 * 
		 * 더 자세히.
		 * 1. 초기화 : 첫 변수는 1로 시작.  i = * 1~9 / num = 7 
		 * 2. 조건식 : i <=9
		 * 3. 실행문 - 반복문 : i * 7
		 *    실행문 - 증감식 : i++
		 * */
		
		int i = 1 , num = 7;
		while(i <=9 ) {
			System.out.println(num + "*" + i + "=" + (num*i));
			i++;	
		}
		
		i = 1;
		num = 6;
		while(i <= 9) {
			System.out.println(num + "*" + i + "=" + (num*i++));
		}
			

	}

}

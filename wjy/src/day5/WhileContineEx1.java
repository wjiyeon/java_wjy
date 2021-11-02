package day5;

public class WhileContineEx1 {

	public static void main(String[] args) {
		/*1~10사이의 홀수를 while문을 이용하여 출력하는 예제
		 * */
		// 방법1
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 0) {
				i++;
				continue;
			}
			System.out.println(i+ " ");
			i++;
		}
		System.out.println("---------");
		// 방법2
		i = 0; // int i 가 이미 입력되어있기 때문에 초기화만 가능.(int i를 적어주면 중복이 됨)
		while(i < 10) {         // continue는 참인경우에만 실행된다. if 절에서 짝수인경우를 제시했으므로 continue는 참이된다. 그리고 다시 조건식으로 돌아가 홀수가 되면 출력.
			i++;
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i+ " ");
		}

	}

}

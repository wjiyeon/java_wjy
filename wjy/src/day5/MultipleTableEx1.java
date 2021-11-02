package day5;

public class MultipleTableEx1 {

	public static void main(String[] args) {
		/*2단에서 9단까지 구구단을 출력하는 코드를 작성하세요.
		 *7단 코드를 가져와서 생각
		 * 
		 * */
	// 내가 한 답변	
	int i, j;
	
	for(j=2 ; j<10 ; j++) {
		for(i=1 ;i<=9 ;i++ ) {
		System.out.println(j + "*" + i + "=" + (j*i));
		}
		System.out.println();
	}
	
	// 선생님 답변
	int num = 2;
	
	while(num <=9) {
		j=1;
		while(j<=9) {
			System.out.println(num + "*" + j + "=" + (num*j));
			j++;
		}
		num++;
	}

}
}

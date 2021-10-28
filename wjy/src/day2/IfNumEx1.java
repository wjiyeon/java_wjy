package day2;

public class IfNumEx1 {

	public static void main(String[] args) {
		/*num가 (0보다 크)면 [양수라고 출력]하고
		 *num이 (0이면 0이라)고 [출력하고]
		 *num이 (0보다 작으)면 [음수라고 출력]하는 코드를 작성하시오. -> 조건식()과 실행문[]을 먼저 찾아라.
		 */
		
		int num = 0;
		if(num > 0) {
			System.out.println(num + "는 양수");
		}else if(num == 0) {
			System.out.println(num);
		}else{
			System.out.println(num + "는 음수");
		}
	}

}

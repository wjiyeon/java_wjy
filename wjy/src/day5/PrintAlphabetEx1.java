package day5;

public class PrintAlphabetEx1 {

	public static void main(String[] args) {
		/*zyx...cba가 출력되도록 코드를 작성하세요.
		 * */
		//방법1
		char chr;
		
		for(chr='z'; chr>= 'a' ;chr--) {
			System.out.print(chr);
		}
		System.out.println();
		
		//방법2
		int i=0;
		while(i < 26) {
			System.out.print((char)('z'-i));
			i++;
		}

	}

}

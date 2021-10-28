package day2;

public class AssignmentEx1 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		num1 = num2;
		System.out.println("num1 ="+ num1 +  ",num2 ="+ num2);
		
		num1 = 10;
		num2 = 20;
		
		num2 = num1;
		System.out.println("num1 ="+ num1 +  ",num2 ="+ num2);
		
		num1 = num1 + num2;
		System.out.println("num1 ="+ num1 +  ",num2 ="+ num2);		
		
		//num1 + num2 = num1; //에러 발생, 대입 연산자 왼쪽에는 변수 1개만 와야 한다.(상수 포함)
		//num1 + 1 = num1; //에러 발생
	

	}

}

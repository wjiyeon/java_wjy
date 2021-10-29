package day3;

import java.util.Scanner;

public class SwitchArithmeticEx1 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산자에 맞는 결과를 출력하는
		 * 코드를 switch문을 이용하여 작성하세요.
		 * 예) 두 정수와 산술 연산자를 입력하세요 : 1 + 2
		 * 1+ 2 = 3
		 */
		
		Scanner scan = new Scanner(System.in);
		// 두 정수와 산술 연산자를 입력받아
        System.out.print("두 정수와 산술 연산자를 입력하세요 : ");
        
        int num1 = scan.nextInt();
        char operator = scan.next().charAt(0);
        int num2 = scan.nextInt();
        
        
        //switch★(식 또는 변수:기준이 되는것)★
        //case는 중복된 값이 있으면 안된다
        switch(operator) {
        case '+' :
         System.out.println(num1 + operator + num2 + '=' + (num1 + num2));
        break;
        
        case '-' :
         System.out.println(num1 + operator + num2 + '=' + (num1 - num2));
        break;
       
        case '*' :
         System.out.println(num1 + operator + num2 + '=' + (num1 * num2));
        break;
       
        case '/' :
         System.out.println(num1 + operator + num2 + '=' + (num1 / num2));
        break;
        
        case '%' :
         System.out.println(num1 + operator + num2 + '=' + (num1 % num2));
        break;
        default: 
        	System.out.println(operator + "는 산술연산자가 아닙니다");
        }
        
	}

}

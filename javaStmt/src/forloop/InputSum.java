package forloop;

import java.util.Scanner;

/**
 * @file : InputSum.java
 * @author pakjkwan@gmail.com
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수까지의 정수의합 구하기 
 * 예) 10 을 입력하면 콘솔에는 1부터 10까지의 합은 55 입니다.
 */

public class InputSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input   = 0, sum = 0;
		System.out.println("정수를 입력");
		input = scanner.nextInt();
		
		for (int i = 0; i < input; i++) {
				sum += i;
		}
		System.out.println("합은"+sum);
	}

}

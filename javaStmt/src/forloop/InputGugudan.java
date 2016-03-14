package forloop;

import java.util.Scanner;

/**
 * @file : InputGugudan.java
 * @author pakjkwan@gmail.com
 * @date 2016. 3. 11.
 * @story 입력받은 정수의 구구단 구하기 예를 들면 2를 입력하면 2단 출력 109를 입력하면 109*2 ~ 109*9 까지 출력 다만,
 *        0과 음수를 입력하면 1이상 정수값만 입력하시오 라고 출력
 */
public class InputGugudan {

	public static void main(String[] args) {
		int dan = 0;
		System.out.println("출력항 구구단의 단수 입력 (정수로 입력!!)");
		Scanner scanner = new Scanner(System.in);
		dan = scanner.nextInt();
		if (dan <= 0){
			System.out.println("종료");
			return; // 이 메소드 종료 시켜라
		}
		
		for (int i = 1; i <=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}

	}

}

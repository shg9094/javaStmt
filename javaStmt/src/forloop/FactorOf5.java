package forloop;

import java.util.Scanner;

/**
 * @file : FactorOf5.java
 * @author USER
 * @date 2016. 3. 14.
 * @story 5의 배수의 갯수 와 합
 */

public class FactorOf5 {
	/**
	 * 
	 * [결과] 1에서 100까지 정수까지 5배수의 갯수는 20이고 5 배수의 합은 1050이다 
	 */
	public static void main(String[] args) {
		int endNum = 0, count =  0, sum = 0; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("리미트 값을 입력");
		endNum = scanner.nextInt();
		
		for  (int i = 1; i<=100;i++) {
			if(i%5 == 0){
				count++;
				sum += i;
			}
		}
		
		System.out.println("1에서 " + endNum + " 정수까지 5배수의 갯수는"  
							+ count + "이고 5 배수의 합은 "+sum+"이다");
	}

}

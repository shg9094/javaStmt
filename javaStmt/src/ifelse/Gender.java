package ifelse;

import java.util.Scanner;
/**
 *@file : Gender.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 3. 11.
 *@story 주민번호를 가지고 성별 판별하는 로직
 */

public class Gender {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		System.out.println("주민 번호 입력 ");
		String name = scanner.next(),ssn = scanner.next();
		char flag = ssn.charAt(7);
		String result = "";
	/*
	 * 800101 - 1234567
	 * 인덱스 0부터 시작
	 * 1, 3 이면 남자 if(flag = 1 || flag =3)
	 * 2, 4 이면 여자
	 * 5, 6 이면 외국인
	 * 다른 값이면 잘못된 주민번호 입니다
	 */
	
		if(flag == '1' || flag == '3') {
			
			result = "남자";
			
		} else if(flag == '2' || flag == '4') {
			
			result = "여자";
			
		} else if(flag == '5' || flag == '5') {
			
			result = "외국인";
		
		} else if(flag == '6' || flag == '7') {
		
			System.out.println("잘못된 주민 등록 번호");
	
		}
		System.out.println(result);
	}
		
}

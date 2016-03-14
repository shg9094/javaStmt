package ifelse;

import java.util.Scanner;

/**
	 *@file : LeapYear.java 
	 *@author pakjkwan@gmail.com
	 *@date 2016. 3. 11.
	 *@story 윤년 프로그램
	 *연도를 4로 나눈값이 0이라면 윤년일 수 있다
	 *그러나 해당 년도가 100으로 나눠 떨어지면 평년이다
	 *그 중 100으로 나눠떨어지더라도 다시 400으로 나눠 떨어지면 윤년이다
	 *예를 들면 1000년은 평년.2000년은 윤년.2016년은 윤년입니다. 
	 */
public class LeapYear {
	
	public static void main(String[] args) {
		int year = 0;
		String yearStr = ""; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("판별 할려는 년도를 입력하세요");
		year = scanner.nextInt();
		if(year % 4 == 0 && year % 100 !=0 ){
			
			yearStr = "윤년";
			
		}
		
		if(year % 100 == 0  && year %400 ==0 ){
			
			yearStr ="윤년";
			
		} else if (year % 100 == 0) {
			
			yearStr ="평년";
			
		}
		
		System.out.println(year+"년"+yearStr+"입니다");
	}
}

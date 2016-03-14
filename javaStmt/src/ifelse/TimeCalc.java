package ifelse;

import java.util.Scanner;

/**
 *@file : TimeCalc.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 3. 11.
 *@story 초를 입력하면 시간, 분, 초를 출력하는 프로그램
 *10000초를 입력하면 7시간 47분 13초 로 출력
 */
public class TimeCalc {
	public static void main(String[] args) {
		int time = 0,second = 0, minute = 0, hour = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력");
		time = scanner.nextInt();
		
		if (second<0) {
			
			System.out.println("초를 잘못 입력");
			
		} else {
			
			hour = time/3600;
			minute = time % 3600/60;
			second = time % 60;
		}
		System.out.println(time+"초는"+hour+"시간"+minute+"분"+second+"초입니다");
	}
}

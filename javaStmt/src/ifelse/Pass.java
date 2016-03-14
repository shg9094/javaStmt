package ifelse;

import java.util.Scanner;

public class Pass {
	/**
	 *@file : Pass.java 
	 *@author pakjkwan@gmail.com
	 *@date 2016. 3. 11.
	 *@story 과목 점수를 입력하면 총점과 평균이 나오고 
	 *이를 통해 합격 여부를 통지하는 프로그램
	 *[결과]
	 **************************************************************
	 *학생 	자바 	JSP 	SQL 	스프링 	총점 	평균 	합격여부
	 *-------------------------------------------------------------
	 *홍길동  80      40     60      70      250      62.5    합격
	 **************************************************************
	 *합격 여부는 60 이상이면 합격
	 */

	public static void main(String[] args) {
		String name = "" ,pass="";
		int java = 0, jsp = 0, sql = 0, spring = 0,sum = 0;
		double avg = 0.0; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		name = scanner.next();
		System.out.println("자바 점수 입력");
		java = scanner.nextInt();
		System.out.println("JSP 점수 입력");
		jsp = scanner.nextInt();
		System.out.println("SQL 점수 입력");
		sql = scanner.nextInt();
		System.out.println("스프링 점수 입력");
		spring = scanner.nextInt();
		
		sum = java+jsp+sql+spring;
		avg = sum/4;
		
		if (avg>60) {
			
			pass = "합격";
		
		} else if (avg<60) {
			
			pass = "불합격";
		
		} else {
			
			System.out.println("잘못 입력");
			
		}
		
		System.out.println("*******************************");
		System.out.println("이름"+"\t"+"자바"+"\t"+"JSP"+"\t"+"SQL"+"\t"+"스프링"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부");
		System.out.println(name+"\t"+java+"\t"+jsp+"\t"+sql+"\t"+spring+"\t"+sum+"\t"+avg+"\t"+pass);
		System.out.println("*******************************");
		
		
	}
}

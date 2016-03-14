package ifelse;

import java.util.Scanner;

/**
	 *@file : GradeReport.java 
	 *@author pakjkwan@gmail.com
	 *@date 2016. 3. 11.
	 *@story 성적표(점수에 따라 A ~ F까지 학점부여)
	 *[결과]
	 **************************
	 *이름	과목	   점수	  학점
	 *--------------------------
	 *홍길동	 영어  89점	  B
	 *************************
	 *90점 이상 A
	 *80점 이상 B
	 *70점 이상 C
	 *60점 이상 D
	 *50점 이상 E
	 *50점 미만 F
	 *만약, 입력한 점수가 100점 초과한다든지 0점 미만 이면 
	 *잘못 입력했습니다 라고 메시지 주기
	 */
public class GradeReport {
	public static void main(String[] args) {
		String name = "",hak="",subject = "";
		int score = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 점수를 입력");
		name = scanner.next();
		score = scanner.nextInt();
		subject = "영어";
		
		if (score >= 90 && score < 101) {
			
			hak = "A";
			
		} else if(score >= 80 && score < 90 ) {
			
			hak = "B";
			
		} else if (score >= 70 && score < 80) {
			
			hak = "C";
			
		} else if (score >= 60 && score < 70) {
			
			hak = "D";
			
		} else if (score >= 50 && score < 60) {
			
			hak = "E";
			
		} else if (score < 50) {
			
			hak = "F";
			
		} else if (score >= 101 && score == 0){
			
			System.out.println("잘못 입력");
			
		}
		
		System.out.println("***********************************");
		System.out.println("이름"+"\t"+"과목"+"\t"+"점수"+"\t"+"학전");
		System.out.println("-----------------------------------");
		System.out.println(name+"\t"+subject+"\t"+score+"\t"+hak);
		System.out.println("***********************************");
	}
}

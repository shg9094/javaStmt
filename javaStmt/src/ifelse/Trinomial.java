package ifelse;

import java.util.Scanner;

public class Trinomial {
	public static void main(String[] args) {
		String name = "", pass = "";
		int kor = 0, eng=0, math = 0,avg = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("국어 점수를  입력");
		kor = scanner.nextInt();
		System.out.println("영어 점수를  입력");
		eng=scanner.nextInt();
		System.out.println("수학 점수를  입력");
		math=scanner.nextInt();
		avg = (kor+eng+math)/3;
		
		if(avg >=60){
			
			pass="합격";
		
		} else {
			
			pass="불합격";
		
		}
		
		System.out.println(name+"학생은"+pass+"입니다");
	}
}

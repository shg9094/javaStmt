package forloop;

import java.util.Scanner;

/**
 *@file : MaxMin.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 3. 11.
 *@story 최고점, 최저점 구하기
 *[결과]
 *학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다.
 *단,정원은 5명입니다.
 *평균점수를 입력하세요
 *....
 *최고점은 100 점이고
 *최저점은 30 점입니다.
 */
public class MaxMin {

	public static void main(String[] args) {
	
	System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다."
						+"단,정원은 5명입니다."
						+"평균점수를 입력하세요");
	Scanner scanner = new Scanner(System.in);
	int[] arr = new int[5];
	int maxScore = 0, minScore = 100;
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scanner.nextInt();
		if(arr[i] > maxScore){
			maxScore = arr[i];
		}
		
		if (arr[i] < minScore) {
			minScore = arr[i];
			
		}
	}
	
	System.out.println("최고점은 "+maxScore+"점이고"
						+"최저점은"+minScore+"점이다");
	}

}

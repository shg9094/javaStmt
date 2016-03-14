package forloop;
/**
 *@file : Gugudan.java 
 *@author
 *@date 2016. 3. 11.
 *@story 2단부터 9단까지 구구단 출력
 *단, 책받침 구구단으로 출력
 *메인에서는 값만 전달 하기
 */
public class Gugudan2 {
	
	public void printGugudan(int start, int end){
		for (int i = start; i <= end; i++) {
			for (int j = 1; j <=9; j++) {		
		
			System.out.println(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
			System.out.println();
	}
	
	public static void main(String[] args) {
		Gugudan2 dan = new Gugudan2();
		
		dan.printGugudan(2, 5);
		dan.printGugudan(6, 9);
	}
}

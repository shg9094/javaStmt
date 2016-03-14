package forloop;
/**
 *@file : Gugudan.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 3. 11.
 *@story 2단부터 9단까지 구구단 출력
 *단, 책받침 구구단으로 출력
 */
public class Gugudan3 {

	public static void main(String[] args) {
	System.out.println("2단부터 9단까지 구구단");
	for (int i = 1; i <=9 ; i++) {
		for (int j = 2; j <=5; j++) {
			System.out.println(j+"*"+i+"="+(j*i)+"\t");
			
		}
		System.out.println();
	}
		System.out.println();
		for (int i = 1; i<= 9;i++) {
			for (int j = 6; j <= 9; j++) {
				System.out.println(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}

}

package forloop;
/**
 *@file : OddSum.java 
 *@author pakjkwan@gmail.com
 *@date 2016. 3. 10.
 *@story 1부터 10까지 홀수의 합
 */
public class OddSum {

	public static void main(String[] args) {
		int sum = 0 ,i =0;
		System.out.println("1부터 10까지 홀수의 합");
		for (i = 1; i <= 10; i+=2) {
			sum +=i;
			
		}
		System.out.println("합은"+sum);
		System.out.println();
		System.out.println("1부터10까지의 홀수 합");
		for ( i = 0; i <= 10; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
			
		}
		System.out.println("합은"+sum);
	}

}

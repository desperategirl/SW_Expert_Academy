package D1;

import java.util.Scanner;

public class SW_10_191120 {

	// 하나의 자연수를 입력 받아
	// 각 자릿수의 합을 계산하는 프로그램을 작성하라.

	// [제약 사항] 자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)

	// [입력] 입력으로 자연수 N이 주어진다. ex) 6789
	// [출력] 각 자릿수의 합을 출력한다. ex) 30

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = Integer.valueOf(scan.nextLine());
		int sum = 0;

		while (num != 0) {

			// 1. num을 10으로 나눈 다음 나머지를 계산해 sum에 담는다.
			// 2. 나눠진 값을 다시 num에 담고
			// 1. num을 10으로 나눈 다음 나머지를 계산해 sum에 담는다.
			// 2. 나눠진 값을 다시 num에 담고
			// 1. ... num이 0보다 작아지게 되면 멈춘다
			
			// 수를 10으로 나누면 #0 + # 1부터 9까지의 자연수는 
			// 나머지의 형태로 떨어져 나오기 때문에
			// 그 나머지를 sum에 더해 나가는 것이다

			sum += (num % 10);
			num /= 10;

		}
		System.out.println(sum);

	}

}

package D1;

import java.util.Scanner;

public class SW_08_191119 {

	public static void main(String[] args) {

		// 2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
		// [제약 사항] :각 수는 1이상 10000이하의 정수이다.

		// [입력] : 가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고,
		// 그 아래로 각 테스트 케이스가 주어진다.
		// 각 테스트 케이스의 첫 번째 줄에는 2개의 수가 주어진다.

		// [출력] : 출력의 각 줄은 '#t'로 시작하고 공백을 한 칸 둔 다음,
		// 몫을 출력하고 공백을 한 칸 둔 다음 나머지를 출력한다.
		// (t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

		/*
		 * 입력 
		 * 3 
		 * 9 2 
		 * 15 6 
		 * 369 15
		 * 
		 * 출력 
		 * #1 4 1 
		 * #2 2 3 
		 * #3 24 9
		 * 
		 */

		

		Scanner scan = new Scanner(System.in);

		int a;
		int b;
		
		// System.out.println("테스트케이스가 몇 번 반복될 것인지를 입력하세요");
		
		int i;
		int testcase = Integer.valueOf(scan.nextLine());

		// System.out.println("a와 b를 입력하세요.");
	
		for (i=1; i<testcase+1 ; i++ ) {
			
			a = Integer.valueOf(scan.nextLine());
			b = Integer.valueOf(scan.nextLine());

			if (a >= 1 && a <= 10000 && b >= 1 && b <= 10000) {
				System.out.println("#"+ i +" "+(a/b)+" "+(a%b));
				
			}
		
		
		}

	}

}

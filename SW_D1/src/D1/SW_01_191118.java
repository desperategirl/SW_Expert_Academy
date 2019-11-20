package D1;

import java.util.Scanner;

public class SW_01_191118 {

	public static void main(String[] args) {

		// 8부터 0까지 순서대로 출력해보기

		/*
		 * 잘 모르겠어서 0부터 9까지 출력해봤다 
		 * 1. 변수 선언을 반복문 밖에서 먼저 하고 
		 * 2. for문 안에서 초기화를 하고, 조건식을 넣고, 증감식 넣음
		 * 
		 * int i; for(i = 0; i < 10 ; i++) { System.out.println(i); }
		 */

		// 비슷한 방식으로 8부터 0까지 출력해 보자

		Scanner scan = new Scanner(System.in);
		System.out.println("8을 입력하세요.");

		int i;
		for (i = Integer.valueOf(scan.nextLine()); i >= 0; i--) {
			System.out.print(i + " ");
		}

		// i에 0이 아니라 8(scan으로 입력 받을 값)을 넣고
		// 그 다음 조건식에서 i의 범위가 0보다 크거나 같다고 넣어준 후
		// 그 후에 증감식에서 1씩 작아지는 감소식을 넣어주면 된다

		// 이렇게 하면 8부터 0까지 출력된다.

	}
}

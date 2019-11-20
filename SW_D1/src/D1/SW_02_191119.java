package D1;

import java.util.Scanner;

public class SW_02_191119 {

	public static void main(String[] args) {

		// 1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.
		// 주어질 숫자는 30을 넘지 않는다.

		/*
		 * 입력 - 8 
		 * 출력 - 1 2 4 8 16 32 64 128 256 2*2*2*2
		 */

		Scanner scan = new Scanner(System.in);
		// 몇 회 반복할 것인지 설정하는 수를 담을 변수
		int num;
		// 횟수는 스캐너 클래스를 이용해 키보드로 입력받는다
		num = Integer.valueOf(scan.nextLine());
		
		// 2를 곱해 출력할 숫자(1)를 담을 변수를 설정
		int j = 1;
		
		// for문을 돌린다
		// i는 0부터 시작해 num-1까지 출력됨
		// 수행문 안의 명령을 총 num번 반복한다
		
		// 여기서 어이없는 점 : 8을 입력했는데 출력이 총 9번 되어야 함
		// 그래서 2번째 조건문 안에 num옆에 +1을 해준다
		for (int i = 0; i < num+1; i++) {
			System.out.print(j + " ");
			// j를 먼저 한 번 출력하고
			// j에 2를 곱한 값을 다시 j에 대입하여 num만큼 반복
			j = j * 2;
		}

	}
}
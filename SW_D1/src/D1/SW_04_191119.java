package D1;

import java.util.Scanner;

public class SW_04_191119 {

	public static void main(String[] args) {

		// 입력으로 1개의 정수 N이 주어진다.
		// 정수 N의 약수를 오름차순으로 출력하는 프로그램을 작성하라.

		// [제약사항] : N은 1이상 1,000이하의 정수이다. (1 ≤ N ≤ 1,000)

		// 입력 : 입력으로 정수 N이 주어진다.
		// 출력 : 정수 N의 모든 약수를 오름차순으로 출력한다.

		Scanner scan = new Scanner(System.in);

		// N = Scanner로 입력받는 1개의 정수
		System.out.println("1이상 1000이하인 1개의 정수 N을 입력하세요.");
		int N = Integer.valueOf(scan.nextLine());

		// a = 1개의 정수 N을 나누는 값
		int a;

		// 제약조건에 따라 N이 1이상 1000이하의 정수일 때만 조건이 실행됨
		if (N >= 1 && N <= 1000) {
			for (a = 1; a <= N; a++) {

				// N을 a로 나누었을 때 나머지가 0인 경우에 a를 출력해라
				if (N % a == 0) {
					System.out.print(a + " ");
				}
			}
		}
	}
}

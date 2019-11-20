package D1;

import java.util.Scanner;

public class SW_12_191120 {

	// 10개의 수를 입력 받아, 평균값을 출력하는 프로그램을 작성하라.
	// (소수점 첫째 자리에서 반올림한 정수를 출력한다.)

	// [제약 사항] 각 수는 0 이상 10000 이하의 정수이다.

	// [입력]
	// 가장 첫 줄에는 테스트케이스의 개수 T가 주어지고,
	// 그 아래로 각 테스트케이스가 주어진다.
	// 각 테스트케이스의 첫 번째 줄에는 10개의 수가 주어진다.

	// [출력]
	// 출력의 각 줄은'#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

	// (t는 테스트케이스의 번호를 의미하며 1부터 시작한다.)

	// 내가 생각한 풀이 방법 :
	// 배열을 선언하여 10개의 수를 키보드로 입력받고 
	// 배열에 들어간 10개의 수를 모두 더한 후 변수에 담고 
	// 그 변수를 10(배열길이)으로 나눈 후 
	// Math.round() method로 처리하여 출력한다.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("테스트케이스 입력!");
		int testcase = Integer.valueOf(scan.nextLine());

		int[] numbers = new int[10];


		for (int i = 1; i < testcase + 1; i++) {
			System.out.println("정수 10개 선언!");
			
			double sum = 0;
			double average = 0;
			
			for (int j = 0; j < numbers.length; j++) {
				if(j>=0 && j<= 10000) {numbers[j] = Integer.valueOf(scan.nextLine());

				// sum 변수를 선언하고
				// 배열의 모든 요소를 더해
				// sum 변수에 담은 후 배열의 길이로 나누어 준다.

				// 나눈 값을 average에 담는다

				sum += numbers[j];
				average = Math.round(sum / numbers.length);
				}
			}
			
			System.out.println((int)sum);
			System.out.print("#" + i + " " + (int)average + "\n");

		}

	}

}

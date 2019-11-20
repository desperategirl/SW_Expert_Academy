package D1;

import java.util.Scanner;

public class SW_11_191120 {

	// 10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.

	// [제약 사항] 각 수는 0 이상 10000 이하의 정수이다.

	// [입력] 가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고,
	// 그 아래로 각 테스트 케이스가 주어진다.
	// 각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.

	// [출력] 출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
	// (t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
	
	
	
	/*
	---------------------------
	입력
	3 
	3 17 1 39 8 41 2 32 99 2
	22 8 5 123 7 2 63 7 3 46
	6 63 2 3 58 76 21 33 8 1
	---------------------------
	출력
	#1 99
	#2 123
	#3 76
	---------------------------
	*
	*/   


	// numbers의 배열의 마지막 자리는
	// numbers.length보다 1 작은 정수의 자리이다.
	// 배열의 자리는 0부터 시작해서 numbers.length-1 자리까지인 것이다
	// 그래서 실제로 numbers 배열에 들어있는 numbers의 배열 요소를 출력할 때
	// 마지막 요소를 출력하려면 numbers.lnegth-1까지 출력해야
	// 제대로 출력된다.

	// numbers.length까지 출력하면
	// 처음에 i < size 라고 반복문을 선언했고
	// ***(여기서 size가 numbers.length)***
	// 반복문은 i번 까지만 반복되어 값을 numbers[]에 넣게 되기 때문에
	// 배열의 자리는 size보다 1개 작은 i까지만 존재하게 된다.
	

	/*
	 * 키보드로 입력받아 배열에 저장된 값 출력 for(i =0; i< size; i++) {
	 * System.out.println(numbers[i]); }
	 */


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("테스트케이스 값을 입력하세요.");
		
		// scanner로 테스트케이스 값을 입력 받아서 담을 변수를 선언한다
		int testcase = Integer.valueOf(scan.nextLine());

		
		for (int i =1; i< testcase +1 ; i++) {
		
		int[] numbers = new int[10];

		System.out.println("0이상 10000이하의 정수를 10개 입력하세요.");

		for (int j = 0; j < numbers.length; j++) {
			numbers[j] = scan.nextInt();
		}

		int max = numbers[0];

		for (int k = 1; k < numbers.length; k++) {
			if (numbers[k] >= max) {
				max = numbers[k];
			}
		}
		/*
		---------------------------
		입력
		3 
		3 17 1 39 8 41 2 32 99 2
		22 8 5 123 7 2 63 7 3 46
		6 63 2 3 58 76 21 33 8 1
		---------------------------
		출력
		#1 99
		#2 123
		#3 76
		---------------------------
		*
		*/ 
		System.out.print("#"+i+" "+max+"\n");

		}
	}

}

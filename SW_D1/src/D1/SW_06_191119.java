package D1;

import java.util.Scanner;

public class SW_06_191119 {
	
	public static void main(String[] args) {
		
		// 1부터 주어진 숫자만큼 모두 더한 값을 출력하시오.
		// 단, 주어질 숫자는 10000을 넘지 않는다.

		// [예제] : 주어진 숫자가 10 일 경우 출력해야 할 정답은
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		
		Scanner scan = new Scanner(System.in);
		
		// 주어진 숫자 = num
		int num; 
		
		// 10000을 넘지 않는 주어진 숫자를 입력하세요
		System.out.println("1이상 10000이하 주어진 숫자를 입력하세요");
		num = Integer.valueOf(scan.nextLine());
		
		int i;
		int sum = 0;
		for(i=1;i<=num ;i++ ) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	

}

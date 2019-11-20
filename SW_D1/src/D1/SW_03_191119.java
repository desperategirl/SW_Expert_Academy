package D1;

import java.util.Scanner;

public class SW_03_191119 {

	
	public static void main(String[] args) {
		
		int A;
		int B;
		
		System.out.println("A와 B의 가위,바위,보를  1,2,3으로 입력하세요.");
		Scanner scan = new Scanner(System.in);
		// A와 B가 가위바위보를 하였다.
		// 가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.
		// A와 B중에 누가 이겼는지 판별해보자. 단, 비기는 경우는 없다.

		// 입력: A와 B가 무엇을 냈는지 빈 칸을 사이로 주어진다.
		// 출력: A가 이기면 A, B가 이기면 B를 출력한다.
		
		// 입력 : 3 2
		// 출력 : A
		
		
		/*
		 * A가 가위(1), B가 바위(2) - B승
		 * A가 가위(1), B가 보(3) - A승
		 * A가 바위(2), B가 가위(1) - A승
		 * A가 바위(2), B가 보(3) - B승
		 * A가 보(3), B가 가위(1) - B승
		 * A가 보(3), B가 바위(2) - A승
		 */
		
		
	
		A = Integer.valueOf(scan.nextLine());
		B = Integer.valueOf(scan.nextInt());
		
		if(A == 1 && B == 2) {
			System.out.println("B");
		} else if(A==1 && B == 3) {
			System.out.println("A");
		} else if(A== 2 && B == 1) {
			System.out.println("A");
		} else if(A==2 && B == 3) {
			System.out.println("B");
		} else if(A==3 && B == 1) {
			System.out.println("B");
		}else if(A==3 && B == 2) {
			System.out.println("A");
		} 
		
		
		

	}

}
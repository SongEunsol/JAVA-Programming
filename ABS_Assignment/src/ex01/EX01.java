package ex01;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;

		System.out.print("10진수 입력: ");
		i = sc.nextInt();
		
		String binary = Integer.toBinaryString(i);
		
		
		System.out.println("2진수 출력: " + binary);
		
		sc.close();
		
	}

}

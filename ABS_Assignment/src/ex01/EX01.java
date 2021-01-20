package ex01;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int decimal;

		System.out.print("10진수 입력: ");
		decimal = input.nextInt();
		
		String toBinary = Integer.toBinaryString(decimal);
		
		System.out.println("2진수 변환 결과: " + toBinary);
		
		input.close();
		
	}

}
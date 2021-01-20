package ex03;

import java.util.Scanner;

public class EX03 {
	
	public static long toFactorial(int positiveNum) {
		if(positiveNum == 1) {
			System.out.println(positiveNum + "! = " + 1);
			return positiveNum;
		} else {
			System.out.println(positiveNum + "! = " + positiveNum + " * " + (positiveNum - 1) + "!");
			return positiveNum * toFactorial(positiveNum - 1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int positiveNum;
		
		System.out.print("양의 정수 입력: ");
		positiveNum = input.nextInt();
		
		if(positiveNum>=1 && positiveNum<=15) {
			System.out.println(toFactorial(positiveNum));
		} else {
			System.out.println("1 이상 15 이하의 수를 입력해주세요.");
		}

		input.close();
		
	}

}
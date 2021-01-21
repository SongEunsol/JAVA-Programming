package ex02;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EX02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 30; i++) {
			System.out.print("문장 입력: ");
			String inputSentence = input.nextLine();
			
			if(inputSentence.equals("END")) {
				break;
			}
			
			if(inputSentence.length()>200) {
				System.out.println("문장의 길이가 너무 깁니다!");
			} else {
				inputSentence = inputSentence.replaceAll("\\p{Punct}", "").replaceAll(" +", " ").trim();
				
				String[] tempSentence = inputSentence.split(" ");
				Map<String, Integer> resultSentence = new TreeMap<>();
				
				for(String j: tempSentence) {
					Integer countSentence = resultSentence.get(j);
					if (countSentence == null) {
						resultSentence.put(j, 1);
					} else {
						resultSentence.put(j, countSentence + 1);
					}
				}
				
				for(String key: resultSentence.keySet()) {
					System.out.println(key + ": " + resultSentence.get(key));
				}
				System.out.println();
			}
		}
		System.out.print("프로그램 종료");
		
		input.close();

	}
}
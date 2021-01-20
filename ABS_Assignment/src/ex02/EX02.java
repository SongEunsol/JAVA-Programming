package ex02;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EX02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String inputSentence = null;
		
		for(int i = 0; i < 30; i++) {
			System.out.print("문장 입력: ");
			inputSentence = input.nextLine();
			
			if(inputSentence.equals("END")) {
				System.out.print("프로그램 종료");
				break;
			}
			
			if(inputSentence.length()>200) {
				System.out.println("문장의 길이가 너무 깁니다!");
			} else {
				String[] tempSentence = inputSentence.split(" ");
				
				for(int j = 0; j < tempSentence.length; j++) {
					tempSentence[j] = tempSentence[j].replaceAll("\\p{Punct}", "").trim();
				}
				
				Map<String, Integer> resultSentence = new TreeMap<>();
				
				for(int j = 0; j < tempSentence.length; j++) {
					Integer countSentence = resultSentence.get(tempSentence[j]);
					if (countSentence == null) {
						resultSentence.put(tempSentence[j], 1);
					} else {
						resultSentence.put(tempSentence[j], countSentence + 1);
					}
				}
				resultSentence.remove("");
				
				for(String key: resultSentence.keySet()) {
					System.out.println(key + ": " + resultSentence.get(key));
				}
				System.out.println();
			}
		}
		
		input.close();

	}
}
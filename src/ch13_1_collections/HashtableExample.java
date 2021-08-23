package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		/** [Hashtable] implements Map
		 * 
		 *  HashMap과 동일한 내부구조 
		 *  - 동기화(synchronized)된 메소드로 구성
		 *  	: 하나의 스레드가 실행 완료해야만 다른 스레드 접근 가능
		 * 
		 */
		
		/*
		 *  아이디 비번 검사하기
		 */
		Map<String,String> map = new Hashtable<>(); // String 자리에 클래스(ex. Member) 올 수 있음 
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			
			System.out.print("아이디: ");
			String id = scanner.nextLine().trim(); //trimming으로 글자 앞뒤 공백제거
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine().trim();
			
			System.out.println();
			
			// ID가 없다면... 용사님 방식
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디가 존재하지 않습니다." + "다시 입력해 주세요.");
				continue; // 다시 입력하게 돌아간다
			}
			// ID가 있다면...
			else {
				// 비번 불일치
				if(!map.get(id).equals(password)) {
					System.out.println("비밀번호가 일치하기 않습니다." + "다시 입력해 주세요.");
					continue; // 다시 입력하게 돌아간다
				}
				// 비번 일치
				else {
					System.out.println("로그인 되었습니다.");
					break;
				}
			}
			
			
//			if(map.containsKey(id)) {
//				if(map.get(id).equals(password)) {
//					System.out.println("로그인 되었습니다.");
//					break;
//				} else {
//					System.out.println("비밀번호가 일치하기 않습니다.");
//					continue; // 다시 입력하게 돌아간다
//				}
//			}else {
//				System.out.println("입력하신 아이디가 존재하지 않습니다." + "다시 입력해 주세요.");
//				continue; // 다시 입력하게 돌아간다
//			}
		}
		scanner.close();
	}
}

package ch13_3_example;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LuckyLotto {
	
	static final int MAX = 45;
	static final int COUNT = 6;
	
	public static void main(String[] args) {
		
			/** [로또 번호 생성기]
			 *  중복 저장되지 않는 HashSet 이용
			 */
		Set<Integer> set = new HashSet<>(COUNT);
		
		// 번호생성 Math.random();
		// 번호를 HashSet에 담아
		
		
		int n = 0;
		while(set.size() < COUNT) {
			n++;
			set.add((int)( Math.random() * MAX )+1);
		}
		System.out.println(n+ "회");
		System.out.println(set);
		
		/// hashSet으로 만든 set List로 만들기
		
		List<Integer> lotto = new LinkedList<>(set);
		
		// sort로 정렬하기. int일때는 오름차순으로 정렬해줌
		Collections.sort(lotto);
		System.out.println(n+ "회");
		System.out.println(lotto);
	
		
		
	}

}

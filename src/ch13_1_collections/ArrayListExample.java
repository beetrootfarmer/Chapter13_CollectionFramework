package ch13_1_collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		/** [ArrayList] implements List
		 * 
		 * -검색(인덱스로 바로 접근)과 배열 맨 끝 저장 시 유리
		 * - 저장 객체가 많고 추가/삭제가 빈번할 경우 불리 
		 * 
		 */
		
		
		List<String> list = new ArrayList<>();
		
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		System.out.println(list);
		System.out.println();
		
		list.add(2,"Database"); // 인덱스 지정해서 추가! 
		System.out.println(list);
		System.out.println();
		list.add("iBATIS");
		System.out.println(list);
		System.out.println();
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2); 
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);  // 2번에 있는 객체 삭제 
		list.remove("iBATIS");  // iBATIS 객체 삭제 
		
		for(int i=0;i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}

package ch13_1_collections;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;


public class LinkedListExample {
	static final int DELAY = 1000;
	public static void main(String[] args) {
		/** [Linked List] implements List
		 *  
		 *  - ArrayList 는 내부 배열에 객체를 저장해서 관리하지만
		 *  - LinkedList는 인접 참조를 링크해서 체인처럼 관리 
		 *  - 특정 인덱스의 객체를 삽입 또는 삭제 시 앞 뒤 링크만 변경되고
		 *    나머지 링크는 변하지 않는다(배열복사 필요 없음) 
		 *    따라서 끝에서부터(순차적으로) 추가 또는 삭제하는 경우 ArrayList가 빠르고 
		 *    중간에서 추가 또는 삭제할 경우 LinkedList가 더 빠르다.
		 */
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime,endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<DELAY; i++) {
			list1.add(0,Integer.toString(i));
		}
		endTime = System.nanoTime();System.out.printf("ArrayList 걸린시간: %5d ns\n", endTime-startTime);

		
		long startTime2,endTime2;
		
		startTime2 = System.nanoTime();
		for(int i=0; i<DELAY; i++) {
			list2.add(0,Integer.toString(i));
		}
		endTime2 = System.nanoTime();System.out.printf("LinkedList 걸린시간: %5d ns\n", endTime2-startTime2);

	}

}

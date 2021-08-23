package ch13_3_example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List <String> list = new LinkedList<>();
		
		list.add("ToyStory");
		list.add("Soul");
		list.add("Inside");
		list.add("Out");
		list.add("Soul");
		
		Iterator<String> itr = list.iterator();
		
		// 반복자(iterator)를 이용해서 순차적인 참조를 할거야
		while (itr.hasNext()) {// 다음에 참조할 값이 있어? hasNext?
			System.out.println(itr.next() + "\t");
		}
		/// 한 번 초기화 
		itr = list.iterator();
		
		System.out.println("==========================");
		
		while (itr.hasNext()) {// 다음에 참조할 값이 있어? hasNext?
			System.out.println(itr.next() + "\t");
		}
		itr = list.iterator();

	}

}

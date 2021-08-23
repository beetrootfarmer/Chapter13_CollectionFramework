package ch13_1_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionEx {

	public static void main(String[] args) {
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("kor");
		list1.add("1");
		System.out.println(list1);
		//출력값 => [kor,1]


		List<Integer> list2 = new ArrayList<>(); //int는 못들어가고 Integer자료형 클래스만 들어갈 수 있다.
		list2.add(1); // <= Wrapper클래스의 숫자를 오토박싱 <= list2.add(new Integer(1));
		list2.add(18);
		//출력값 => [1,18]

		List<Character> list3 = new Vector<>();
		list3.add('f');
		list3.add('x');
		System.out.println(list3);
		//출력값 => [f,x]

		List<Float> list4 = new LinkedList<>();
		list4.add(0.1f);
		list4.add(1.1f);
		System.out.println(list4);
		//출력값 => [0.1,1.1]
		
		List<Double> list5 = new LinkedList<>();
		list5.add(0.1);
		list5.add(0.1);
		System.out.println(list5);
		//출력값 => [0.1,0.1]
		
		Set<Double> set = new HashSet<>();
		set.add(0.1);
		set.add(0.1);
		System.out.println(set);
		//출력값 => [0.1] = HashSet은 중복을 허용하지 않는다.
		
		Map<Integer, String> map = new HashMap<>();
		map.put(211, "비트");
		map.put(201, "잘해");
		System.out.println(map);
		//출력값 => {211=비트, 201=잘해}
		
			

	}

}

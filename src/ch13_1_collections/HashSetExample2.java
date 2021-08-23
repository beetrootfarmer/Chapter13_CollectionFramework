package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("김연경", 34));
		set.add(new Member("김수지", 35));
		set.add(new Member("김희진", 31));
		set.add(new Member("박정아", 29));
		
		System.out.println("총 인원수: " + set.size());
		System.out.println();
		
		Iterator<Member> ibk = set.iterator();
		while(ibk.hasNext()) {
			Member m = ibk.next();
			System.out.println(m.name + ", " + m.age);
		}
		
		//작업완류 후 ibk 초기화 
		ibk = set.iterator();
	}

}

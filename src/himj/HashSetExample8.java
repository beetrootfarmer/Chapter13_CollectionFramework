package himj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample8 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1,"혜지김"));
		set.add(new Student(2,"마크리"));
		set.add(new Student(1,"난실조"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}

	}

}

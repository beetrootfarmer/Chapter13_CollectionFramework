package ch13_1_collections;

import com.libs.collection.MyeList;
import com.libs.collection.MyeSmartList;

public class MyeCollectionTest3 {
	public static void main(String[] args) {
		
		MyeList<String> list = new MyeSmartList<String>();
		
		list.add("1");
		list.add("3");
		list.add("heart");
		
		System.out.println(list);
		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("----------------------------");
		
		list.add("kor");
		list.add("홍길동");
		list.add("a");
		
		MyeList<Integer> list2 = new MyeSmartList<>();
		list2.add(new Integer(100)); /// Auto Boxing 
		
		System.out.println(list);
		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("----------------------------");
		
		
		MyeList<Object> list3 = new MyeSmartList<>();
		list3.add("안녕");
		list3.add(11);
		list3.add(3.14f);
		list3.add('A'); ///Auto Boxing(new Character('A))
		/// 이렇게 하면 get해서 꺼내쓸 때 순서대로 기억하고 형변환 해야해서 Object형으로 잘5 섞어쓰지 않음 
		
		list.clear();
		// |0|0|0|
		System.out.println(list); ///Object형 참조변수니까 초기화했을 때 null 값 
		System.out.println("list[2]의 값: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("----------------------------");
	}

}
//과제야 
// 증가 
// ArrayIndexOutOfBoundsException 해결하기
// list.add(7);

// 삭제 
// list.remove(1);
// [1, 3, 5,] => [1, 5,]

// list.clear(); // 입력된 값들 다 없애고 초기화 
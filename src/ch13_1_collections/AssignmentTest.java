package ch13_1_collections;

import java.util.ArrayList;
import java.util.List;

import com.libs.collection.MyeMyeList;

public class AssignmentTest {

	public static void main(String[] args) {
			
		MyeMyeList list = new MyeMyeList(3);
			list.add(1);
			list.add(3);
			list.add(5);
			
			// ArrayIndexOutOfBoundsException 해결하기
			 list.add(7);
			 
				System.out.println(list);
				System.out.println("list[2]의 값: " + list.get(2));
				System.out.println("size: " + list.size());
				System.out.println("----------------------------");
				
			 list.remove(1);
//			 [1, 3, 5,] => [1, 5,]
			
			
			System.out.println(list);
			System.out.println("list[2]의 값: " + list.get(2));
			System.out.println("size: " + list.size());
			System.out.println("----------------------------");
			
			// |0|0|0|
			list.clear();
			System.out.println(list);
			System.out.println("list[2]의 값: " + list.get(2));
			System.out.println("size: " + list.size());
			System.out.println("----------------------------");
			
			
			
//			public void remove(list[i]) {
//				i = 
//			}
			
			
			
//	public void remove(amount) {
//		list[amount];
				
				
			}
		
			
//			List<Integer> listB = new ArrayList<>();
//			listB.add(1);
//			listB.add(3);
//			listB.add(5);
//			listB.add(7);
//			System.out.println(listB);
	}


	//과제야 
	// 증가 
	// ArrayIndexOutOfBoundsException 해결하기
	// list.add(7);

	// 삭제 
	// list.remove(1);
	// [1, 3, 5,] => [1, 5,]

	// list.clear(); // 입력된 값들 다 없애고 초기화 



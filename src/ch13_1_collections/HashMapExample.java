package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/** [HashMap] implements Map
		 * 
		 * - 키(key) 객체, 값(Value) 객체로 구성된 Map.Entry 객체를 저장하는 구조
		 * 	 : Entry 는 Map 인터페이스 내부에 선언 된 중첩 인터페이스 
		 * 
		 *  - 키(key)는 중복 저장 될 수 없지만 값은 중복 저장 가능 
		 */
		
		// Map 컬렉션 생성 
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("이마크", 19);
		map.put("종천러", 01);
		map.put("이마크", 99);  // key값이 같으므로 마지막 value로 대체된다
 		map.put("치타폰", 96);
 		
		System.out.println("총 Entry 수: " + map.size());
		System.out.println(map);
		
		//객체 찾기
		System.out.println("\t이마크: " + map.get("이마크")); 
		System.out.println();
		// 여기 이마크 있니?
		System.out.println("여기 이마크 있니? " + map.containsKey("이마크"));
		System.out.println();

		
		// [객체 루핑 처리] 
		
		// 1. Set<Key> 이용
			// key 구슬들이 주머니 안에 
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // key주머니 받아왔다 피주머니키주머니아주머니복주머니
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); // key값 가져오기 // 타입 매개변수이름 = iterator set 매개변수 이름 . next();
			Integer value = map.get(key);	// value 값 가져오기
			System.out.println("\t" + key + ":"  + value);
			System.out.printf("Key: %s, value: %d\n", key, value);
		}
		keyIterator = keySet.iterator(); // 초기화하기
		System.out.println("=====================================");
		
		// 객체 삭제
		map.remove("신용권");
		System.out.println("총 Entry 수: " + map.size());
		
		
		// 2. Set<Map.Entry> 이용
			// map.entry구슬들이 주머니 안에 
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();	// Map.Entry에서 하나 꺼내오기
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " :" + value);
		}
		
		System.out.println();
		// 객체 전체 삭제
		map.clear();
	}
	
}

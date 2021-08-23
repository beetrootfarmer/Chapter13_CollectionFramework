package himj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("이샤크", 22);
		map.put("조죠스", 21);
		map.put("정캥거루", 27);
		map.put("김호랑", 25);
		map.put("이샤크", 33);
		System.out.println("총 Entry수: " + map.size());
		
		// 객체 찾기
		System.out.println("객체 찾기");
		System.out.println("\t김호랑 : " + map.get("김호랑"));
		System.out.println();
		
		// 객체를 하나씩 처리
//	 *  [keySet()메소드를 활용한 Map 값 얻기]
	
			 // 객체를 Set에 담아 리턴
			Set<String> kese = map.keySet();
			 // 반복자를 이용해 kese Set의 값을 리턴하기
			Iterator<String> keIt = kese.iterator();
			
			 // 반복자로 객체 값 리턴
			while(keIt.hasNext()) {
				String key = keIt.next();
				Integer value = map.get(key);
				System.out.println("\t" + key + ":" + value + "세");
			}
			System.out.println();
			
		map.remove("조죠스");
		System.out.println("조죠스 제거");
		map.put("김호랑", 23);
		System.out.println("김호랑 나이 수정");
		System.out.println();
		
			
//	 *  [entrySet()메소드를 활용한 Map.Enrty 값 얻기]
	 
			Set<Map.Entry<String, Integer>> enSe = map.entrySet();
			 // 반복자를 이용해 Map.Entry 얻기 
			Iterator<Map.Entry<String, Integer>> enIt = enSe.iterator();
			
			while(enIt.hasNext()) {
				Map.Entry<String, Integer> ent = enIt.next();
				String key2 = ent.getKey();
				Integer value2 = ent.getValue();
				System.out.println("\t" + key2 + ":" + value2 + "세");
			}
			System.out.println();
			
			map.clear();
			System.out.println("청소완료 후 개체 수 " + map.size());
	}
}

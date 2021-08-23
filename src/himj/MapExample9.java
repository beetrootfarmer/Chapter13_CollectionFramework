package himj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample9 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("purple", 92);
		map.put("blue", 96);
		map.put("red", 86);
		
		String name = null;
		int maxScore=0;
		int totalScore = 0;
		
		Set<Map.Entry<String,Integer>> entrySet= map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		System.out.println("평균점수 : " + totalScore/entrySet.size());
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
		
		}
}

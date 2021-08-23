package himj;

public class ONE13 { }
/* 1.
 * O List컬렉션 중복저장
 * X Set 순서유지, 중복저장X
 * O Map 키와 값으로 구성된 Map.Entry
 * ? 하나의 null만 저장 가능하다?
 */
	
	/* 2.
	 * O 대표적인 구현 클레스로 ArrayList Vector LinkedList 
	 * O Vector는 동기화 스레드를 허용하지 않기때무네?
	 * O ArrayList는 객체를 삭제하면 삭제된 위치는 비어있게 된다
	 * O LinkedList 객체를 삽입하거나 제거할때 편
	 */
	
	/* 3.
	 * O 대표적인 구현 클레스로 HashSet, LinkedHashSet, TreeSet
	 * O Set collection에서 객체를 하나씩 꺼내올때 iterator사용
	 * O HashSet에서 hashCode()와 equals() 이용해 중복된 객체 판별
	 * x
	 */
	
	/* 4.
	 * O 대표적인 구현 클레스로 HashMap, Hashtable, TreeMap
	 * O HashMap은 hashCode()와 equals() 이용해 중복비교 
	 * O  멀티 스레드 환경에서..hashtable은 동시에 메소드를 실행할 수 없게함
	 * O 다른 키에 객체 중복저장 불가능..
	 */
	
	/* 5. 
	 * List<Board> list = new Vector<Board>();
	 * 왜?
	 * 
	 * 
	 */
	
	/* 6.
	 * Map<String, Integer> score = new HashMap<>();
	 * 
	 */
	
	/* 7.
	 * BoardDao 객체
	 * getBoardList() 메소드
	 * List<Board> 타입의 컬렉션
	 
	 * 
	 */




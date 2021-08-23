package com.libs.collection;

public class MyeSmartList<E> implements MyeList<E> {
	
	// 필드 선언
	/// 요소를 저장할 배열
	private  Object[] elementData;
	
	/// 현재 배열의 총 길이
	private int capacity;
	
	private final int amount = 3;
	
	/// 배열 요소의 현재 위치
	private int cursor;
	
	// 생성자
	MyeSmartList (int amount) {
		this.capacity = amount;
		elementData  = new Object[capacity];
		cursor = 0;
	}
	public MyeSmartList (){
		this(2);
		
	}
	// 메소드
	public void add(E e)  {
		// 현재 용량을 초과하는지의 여부 조건검사
		if(capacity <= cursor ) {
			// 배열 복사 수행
			/// 새로운 배열 생성 
			Object[] tempArr = new Object[capacity + amount];
			
			/// 요소 복사
			System.arraycopy(elementData, 0, tempArr, 0, elementData.length);
			
			/// 참조 변경
			elementData = tempArr;
			
			/// 배열 용량 업데이트
			capacity += amount;
			
		}
		
		elementData[cursor++] = e;
	}
	@Override
	public E get (int idx) {
		return(E) elementData[idx];
	}
	@Override
	public int size() {
		return cursor;
	}
	@Override
	public void remove(int idx) {
		// 삭제하고자 하는 idx가 마지막이면 0으로 초기화
		if(idx != cursor -1 ) {
			System.arraycopy(elementData, idx+1, elementData, idx, (cursor-1) -idx);
		}
		// 마지막 데이터 초기화 
		elementData[cursor - 1] = 0;
		
		// 현재 위치 재설정
		cursor--;
	}
	
	@Override
	public void clear() {
		elementData = new Object[amount];
		capacity = amount;
		cursor = 0;
	}
	
	/// 요소 출력
	@Override
	public String toString() {
		String tmp = "";
		for(Object i : elementData) {
			tmp += i + ", ";
		}
		return "[" + tmp + "]";
	}
	
}

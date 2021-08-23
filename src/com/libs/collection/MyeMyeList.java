package com.libs.collection;
/**
 * 2021.08.18
 * java 211기 >>>
 * @author heji
 * int[] 관리하기 위한 자료구조 
 */

public class MyeMyeList {
	// [ 필드 ]
	/// 요소를 저장할 배열 
	private int[] mye;
	
	
	/// 현재 배열의 총 길이(length) **
	private int capacity;
	
	/// 늘려 줄 배열의 용량  ** 왜 상수처리?
	private final int amount;
	
	/// 배열 요소의 현재 위치 (다음 저장될 위치를 가리킨다)
	private int cursor;
	private String i;
	
	// 생성자
	public MyeMyeList(int amount) {  // 여기서 3을 입력하면배열이 찼을 때 3이 또 늘어난다. **
		this.amount = amount;
		this.capacity = this.amount;
		mye = new int [capacity]; // 입력값 받기 
		cursor = 0;
	}
	
	// 메소드 
	/// 요소 추가 
	public void add(int nam) {
		// 현재용량을 초과하는지의 여부 조건 검사 **
		if(capacity <= cursor) {
			// 배열복사 수행 
			/// 새로운 배열 생성 
			int[] tempArr = new int[capacity + amount];
			/// 요소 복사
			System.arraycopy(mye, 0, tempArr, 0, mye.length);
//							복사할 것, 출발, 붙여넣을 것,출발, 얼만큼 길이  
//			for(int i=0; i<mye.length; i++) {
//				tempArr[i] = arr[i];
//			}
			
			/// 참조 변경
			mye = tempArr;
			
			// capacity가 바뀌어있지 않음 
			/// 배열 용량을 재설정
			this.capacity += amount;
		}
		mye[cursor++] = nam;
		
	}
	
	/// 요소 삭제
	public void remove(int idx) {
		// 삭제하고자 하는 idx가 마지막이면 0으로 초기화
		if(idx != cursor -1) {
			System.arraycopy(mye, idx+1, mye, idx, (cursor-1)-idx);
			// 배열의 처리
			
		}
		// 마지막 데이터 초기화 
		mye[cursor-1] = 0;
		
		// 현재 위치를 재설정 
		cursor--;
		
	}
	
	/// 요소 얻기 
	public int get(int idx) {
		return mye[idx];
	}
	/// 요소 개수 
	public int size() {
//		return mye.length; //총 배열길이가 아니라 들어있는 값의 수를 리턴함
		return cursor; //총 배열길이는 커서
	}
	
	/// 요소 출력
	public String toString() {
		String tmp = "";
		for(int i : mye) {
		
			tmp += i + ",";
		}
		return "["+ tmp + "]";	
	}

	/// 배열 초기화
	public void clear() {
		mye = new int[amount];
		this.capacity = this.amount;
		mye = new int [amount]; // 입력값 받기 
		cursor = 0;
		
	/// 커서위치 초기화
	cursor = 0;
	///용량 초기화 
	}
}

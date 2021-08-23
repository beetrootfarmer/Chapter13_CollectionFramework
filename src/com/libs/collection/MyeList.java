package com.libs.collection;

//MyeMyeList 를 인터페이스로 

public interface MyeList<E> {
	
	public abstract void add(E element);	
	 
	 public abstract E get(int idx);
	 
	 public abstract void remove(int idx);
	 
	 public abstract int size();
	 
	 public abstract void clear();

}

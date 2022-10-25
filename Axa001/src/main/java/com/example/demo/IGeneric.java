package com.example.demo;

import java.util.List;

public interface IGeneric<T, K> {

	public void add(T t);
	public T find(K k);
	public List<T> all();
}

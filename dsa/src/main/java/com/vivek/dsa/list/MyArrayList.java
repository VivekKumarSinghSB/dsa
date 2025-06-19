package com.vivek.dsa.list;

public class MyArrayList<T> {

	private T[] arr;
	private int size;
	private static final int INITIAL_CAPACITY = 10;

	@SuppressWarnings("unchecked")
	public MyArrayList() {
		arr = (T[]) new Object[INITIAL_CAPACITY];
		size = 0;
	}

	@SuppressWarnings("unchecked")
	public MyArrayList(int capacity) {
		arr = (T[]) new Object[capacity];
		size = 0;
	}

	public void add(T value) {
		if (size == arr.length) {
			resize();
		}
		arr[size++] = value;
	}

	private void resize() {
		@SuppressWarnings("unchecked")
		T[] newArr = (T[]) new Object[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

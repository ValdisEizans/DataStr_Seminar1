package datastr;

public class MyArrayList {
	
	//mainigie
	private char[] list;
	private int howManyElements = 0;
	private final int DEFAULT_SIZE = 8;
	private int size = DEFAULT_SIZE;
	
	//konstruktori
	public MyArrayList() {
		list = new char[size];
	}
	
	public MyArrayList(int inputSize) {
		if(inputSize > 0 && inputSize < 100000) {
			size = inputSize;
		}
		list = new char[size];
	}
	
	//funkcijas
	private boolean isEmpty() {
		//1. garais pieraksts
		/*if(howManyElements == 0) {
			return true;
		}
		else {
			return false;
		}*/
		
		//2. isais pieraksts
		//return (howManyElements == 0 ? true : false);
		
		//3. ar atgriezto vertibu
		return (howManyElements == 0); 
	}
	
	private boolean isFull() {
		return (howManyElements == size); 
	}
	
	//resize
	private void resize() {
		int newSize = (howManyElements < 200) ? (size*2) : (int)(size*1.5);
		char[] newList = new char[newSize]; 
				
		for(int i=0; i < howManyElements; i++) {
			newList[i] = list[i];
		}
		
		list = newList;
		size = newSize;
		System.gc();
	}
	
	

}

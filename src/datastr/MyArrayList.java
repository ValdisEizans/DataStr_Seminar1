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
	
	//pievienot elementu beigas
	public void add(char element) {
		if(isFull()) {
			resize();
		}
		
		//list[howManyElements] = element;
		//howManyElements++;
		list[howManyElements++] = element;
	}

	//pievienot elementu konkreta vieta
	public void add(char element, int index) throws IllegalArgumentException{
		if(index < 0) {
			throw new IllegalArgumentException("Nav iespejams pievienot elementu, jo indekss negativs!");
		}
		if(index > howManyElements) {
			throw new IllegalArgumentException("Nav iespejams pievienot elementu, jo indekss lielaks par atlauto!");
		}
		
		if(index == howManyElements) {
			add(element);
			return; //apstadina funkcijas darbibu
		}
		//ja nelieto return, tad OBLIGATI else bloks
		if(isFull()) {
			resize();
		}
		
		for(int i = howManyElements; i > index; i--) {
			list[i] = list[i-1];
		}
		
		list[index] = element;
		howManyElements++;
	}
	
	public int getHowManyElements(){
		return howManyElements;
	}
	
	

}

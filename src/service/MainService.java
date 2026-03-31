package service;

import java.util.Arrays;

import datastr.MyArrayList;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		MyArrayList<Character>	symbols = new MyArrayList<Character>(3);
		symbols.add('a');
		symbols.add('b');
		symbols.add('c');
		symbols.add('a');
		try {
			/*symbols.print();
			symbols.add('Z',1);
			symbols.print();
			symbols.remove(2);
			symbols.print();
			System.out.println(symbols.get(1));
			System.out.println(symbols.search('a'));
			System.out.println(Arrays.toString(symbols.getNextElements('a')));
			symbols.sort();
			symbols.print();*/

		}
		catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println("------------------------------------  DARBS AR STUDENTIEM --------------------------------------");
			MyArrayList<Student> allStudents = new MyArrayList<Student>();
			Student s1 = new Student("Janis", "Berzins", "123545-87452");
			Student s2 = new Student("Guntis", "Liepins", "874519-87452");
			Student s3 = new Student("Liga", "Egle", "986325-87452");
			allStudents.add(s1);
			allStudents.add(s2);
			allStudents.add(s3,0);
			allStudents.print();
			System.out.println(allStudents.get(1));
			System.out.println(allStudents.search(s2));//indekss, kur glabajas Liga
			System.out.println(Arrays.toString(allStudents.getNextElements(s1)));
			allStudents.sort();
			allStudents.print();
			allStudents.remove(1);
			allStudents.print();
			allStudents.makeEmpty();
			allStudents.add(new Student("Genadijs", "Testeris", "123545-87452"));
			allStudents.print();

			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

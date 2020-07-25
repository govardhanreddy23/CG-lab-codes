package com.capg.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.capg.model.Student;

public class StudentComp {

	public static void main(String[] args) {
		List<Student> student=Arrays.asList(new Student("govardhan",21,180),
				new Student("somu",23,185),
				new Student("Rahul",22,160));
		Collections.sort(student, (s1,s2) -> s1.height-s2.height);
		System.out.println("student list is");
		student.forEach(t->System.out.println(t));
     
	}
	class SortByName implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			
			return s1.name.compareTo(s2.name);
		}
		
	}
	class SortByAge implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			
			return s1.age.compareTo(s2.age);
		}
		
	}

}

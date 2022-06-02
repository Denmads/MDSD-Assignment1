package tests;

import p5.P5Main;

import java.util.Arrays;
import java.util.List;

import p5.DataCourse;
import p5.DataTeacher;

public class TestP5 {
	public static void main(String argv[]) throws InterruptedException {
		P5Main p = new P5Main();
		// Set parameters and start network
		p.setParameterActive_course(new DataCourse("MDSD",10));
		p.compute();
		// Generate inputs
		p.inputTeachers(new DataTeacher("Bob",32,new DataCourse("Algorithms",10)));
		p.inputTeachers(new DataTeacher("Ulrik",48,new DataCourse("MDSD",10)));
		p.inputTeachers(new DataTeacher("Ulrik next year",49,new DataCourse("MDSD",5)));
		p.inputTeachers(new DataTeacher("Ulriks TA",23,new DataCourse("MDSD",10)));
		p.inputTeachers(new DataTeacher("John",48,new DataCourse("Math",10)));
		p.inputTeachers(new DataTeacher("Joe",48,new DataCourse("Physics",10)));
		// Wait for computations to finish
		Thread.sleep(1000);
		// Print outputs
		System.out.println("processed_people="+p.getProcessed_people());
		System.out.println("names="+p.getTeacher_names());
		// Check outputs
		List<DataTeacher> dt = Arrays.asList(new DataTeacher("Ulrik",49,new DataCourse("MDSD",10)),new DataTeacher("Ulriks TA",24,new DataCourse("MDSD",10)));
		List<String> names = Arrays.asList("Bob", "Ulrik", "Ulrik next year", "Ulriks TA", "John", "Joe");
		if(dt.equals(p.getProcessed_people()) && names.equals(p.getTeacher_names()))
			System.out.println("OK");
		else
			System.out.println("FAIL");
	}
}

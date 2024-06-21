package com.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		Student student = new Student(15, 2, "Somnath");
		Student student2 = student.clone();
		System.out.println(student);
		System.out.println(student2);
		System.out.println("The objects are equal ? "+((student2==student)? "Yes": "No"));
	}

}

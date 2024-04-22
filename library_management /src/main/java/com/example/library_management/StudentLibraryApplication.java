package com.example.library_management;

import com.example.library_management.Repositories.AuthorRepository;
import com.example.library_management.Repositories.BookRepository;
import com.example.library_management.Repositories.CardRepository;
import com.example.library_management.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentLibraryApplication {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CardRepository cardRepository;

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentLibraryApplication.class, args);
	}


	public void run(String... args) throws Exception {

	}

}

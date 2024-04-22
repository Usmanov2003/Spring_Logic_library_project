package com.example.library_management.Services;

import com.example.library_management.Model.Card;
import com.example.library_management.Model.Student;
import com.example.library_management.Repositories.CardRepository;
import com.example.library_management.Repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardRepository cardRepository;

    @Autowired
    CardService cardService;

    public void createStudent(Student student) {

        Card card = cardService.createCard(student);
        logger.info("The card for the student{} is created with the card details{}", student,card);
    }

    public int updateStudent(Student student) {
        return studentRepository.updateStudentDetails(student);
    }

    public void deleteStudent(int id) {

        cardService.deactive(id);
        studentRepository.deleteCustom(id);
    }
}





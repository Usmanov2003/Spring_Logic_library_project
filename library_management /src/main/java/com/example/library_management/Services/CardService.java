package com.example.library_management.Services;

import com.example.library_management.Model.Card;
import com.example.library_management.Model.CardStatus;
import com.example.library_management.Model.Student;
import com.example.library_management.Repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CardService {

    @Autowired
    CardRepository cardRepository;

    public Card createCard(Student student) {
        Card card = new Card();
        student.setCard(card);
        card.setStudent(student);
        cardRepository.save(card);
        return card;
    }

    public void deactive(int student_id) {
        cardRepository.deactivateCard(student_id, CardStatus.DEACTIVATED.toString());
    }
}

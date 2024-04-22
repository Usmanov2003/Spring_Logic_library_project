package com.example.library_management.Controllers;

import com.example.library_management.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/issueBook")
    public ResponseEntity issueBook(@RequestParam(value = "cardId") int cardId,
                                    @RequestParam("bookId") int bookId) throws Exception {
        String transaction_id = transactionService.issueBooks(cardId, bookId);
        return new ResponseEntity("Your Transaction was succesfull here is your Txn id: " + transaction_id, HttpStatus.OK);
    }
}

package com.example.quest.bystrov.exceptions;

public class WrongAnswerException extends RuntimeException {
    public WrongAnswerException(String message) {
        super(message);
    }
}

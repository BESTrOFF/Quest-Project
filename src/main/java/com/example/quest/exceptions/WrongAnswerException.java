package com.example.quest.exceptions;

public class WrongAnswerException extends RuntimeException {
    public WrongAnswerException(String message) {
        super(message);
    }
}

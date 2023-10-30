package com.example.quest.questions;

import java.util.List;

public abstract class Question {
    String question;

    List<String> variants;

    String path;

    public String getQuestion(String answer) {
        return question;
    }


    public List<String> getVariants(String answer) {
        return variants;
    }

    public String getPath() {
        return path;
    }
}

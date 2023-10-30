package com.example.quest.questions;

import java.util.HashMap;
import java.util.List;

public class QuestionsList {
    private final HashMap<String, Question> questionHashMap;

    public QuestionsList(){
        questionHashMap = new HashMap<>();

        EndGame endGame = new EndGame();

        questionHashMap.put("LostTheMemory", new LostTheMemory());
        questionHashMap.put("ChallengeAccepted", new ChallengeAccepted());
        questionHashMap.put("EndGame", endGame);
        questionHashMap.put("Lie", endGame);
        questionHashMap.put("Bridge", new Bridge());
    }

    public Question nextQuestion(String answer){
        return questionHashMap.get(answer);
    }

}

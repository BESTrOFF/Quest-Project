package com.example.quest.questions.quests;

import java.util.List;

public interface Quest {
     String getQuestion(String answer);
    List<String> getVariants(String answer);
    String getPath(String answer);
}

package com.example.quest.bystrov.quests;

import java.util.List;

public interface Quest {
    String getQuestion(String answer);

    List<String> getVariants(String answer);

    String getPath(String answer);

    String getFirstAnswer();
}

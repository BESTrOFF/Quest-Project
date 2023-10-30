package com.example.quest;

import java.util.ArrayList;
import java.util.List;

public class AlienQuestions {
    public void formNextQuestion(String answer){
        String question;
        List<String> variants;
        int param;

        switch (answer){
            case ("LostTheMemory"):
                question = "You've lost your memory. Accept the UFO challenge?";
                variants = new ArrayList<>();

                variants.add("<button type=\"submit\" name=\"answer\" value=\"ChallengeAccepted\">Yes</button>");
                variants.add("<button type=\"submit\" name=\"answer\" value=\"EndGame\">No</button>");
                break;

            case ("ChallengeAccepted"):
                question = "Go up to the bridge?";
                variants = new ArrayList<>();

                variants.add("<button type=\"submit\" name=\"answer\" value=\"Bridge\">Yes</button>");
                variants.add("<button type=\"submit\" name=\"answer\" value=\"EndGame\">No</button>");
                break;
        }
    }
}

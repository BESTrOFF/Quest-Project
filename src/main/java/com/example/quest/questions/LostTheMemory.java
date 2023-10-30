package com.example.quest.questions;

import java.util.ArrayList;
import java.util.List;

public class LostTheMemory extends Question {
    public LostTheMemory() {
        path = "WEB-INF/jsps/game.jsp";
        question = "You've lost your memory. Accept the UFO challenge?";
        variants = new ArrayList<>();

        variants.add("<button type=\"submit\" name=\"answer\" value=\"ChallengeAccepted\">Yes</button>");
        variants.add("<button type=\"submit\" name=\"answer\" value=\"EndGame\">No</button>");
    }
}

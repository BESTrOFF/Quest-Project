package com.example.quest.questions;

import java.util.ArrayList;

public class Lie extends Question {
    public Lie() {
        path = "WEB-INF/jsps/game.jsp";
        question = "You've lost your memory. Accept the UFO challenge?";
        variants = new ArrayList<>();

        variants.add("<button type=\"submit\" name=\"answer\" value=\"ChallengeAccepted\">Yes</button>");
        variants.add("<button type=\"submit\" name=\"answer\" value=\"EndGame\">No</button>");
    }
}

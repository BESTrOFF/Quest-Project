package com.example.quest.questions;

import java.util.ArrayList;

public class ChallengeAccepted extends Question{
    public ChallengeAccepted(){
        path = "WEB-INF/jsps/game.jsp";
        question = "Go up to the bridge?";
        variants = new ArrayList<>();

        variants.add("<button type=\"submit\" name=\"answer\" value=\"Bridge\">Yes</button>");
        variants.add("<button type=\"submit\" name=\"answer\" value=\"EndGame\">No</button>");
    }
}

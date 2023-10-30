package com.example.quest.questions;

import java.util.ArrayList;
import java.util.List;

public class EndGame extends Question {
    public EndGame() {
        path = "WEB-INF/jsps/game.jsp";
        question = "End. Play again?";
        variants = new ArrayList<>();

        variants.add(" <a href=\"index.jsp\">Try again?</a>");
    }

    @Override
    public String getQuestion(String answer) {
        if (answer.equals("Lie")) {
            int i = (int) (Math.random() * 10);
            if (i > 3) {
                question = "They belived you and take you to home.";
            } else {
                question = "They didn't belived you and kill you.";
            }

            return question;
        }
        return question;
    }
}

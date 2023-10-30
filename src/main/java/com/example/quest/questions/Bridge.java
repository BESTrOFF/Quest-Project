package com.example.quest.questions;

import java.util.ArrayList;

public class Bridge extends Question{
    public Bridge(){
        path = "WEB-INF/jsps/game.jsp";
        question = "Who are you?";
        variants = new ArrayList<>();

        variants.add("<button type=\"submit\" name=\"answer\" value=\"EndGame\">True</button>");
        variants.add("<button type=\"submit\" name=\"answer\" value=\"Lie\">Lie</button>");

    }
}

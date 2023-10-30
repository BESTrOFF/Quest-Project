package com.example.quest.controllers;

import com.example.quest.questions.quests.AlienQuest;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "game", value = "/game")
public class GameServlet extends HttpServlet {
    String predAnswer = "";

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String answer = req.getParameter("answer");
        if (StringUtils.isEmpty(answer)) {
            answer = (String) req.getAttribute("answer");
        }

        AlienQuest quest = new AlienQuest();

        List<String> variants = quest.getVariants(answer);
        String question = quest.getQuestion(answer);
        String path = quest.getPath(answer);

        req.setAttribute("variants", variants);
        req.setAttribute("question", question);

        predAnswer = answer;

        RequestDispatcher dispatcher = req.getRequestDispatcher(path);
        dispatcher.forward(req, resp);
    }
}

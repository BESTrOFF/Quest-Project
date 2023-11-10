package com.example.quest.bystrov.controllers;

import com.example.quest.bystrov.quests.QuestFabric;
import com.example.quest.bystrov.quests.Quest;
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
    private Quest quest;
    private QuestFabric questFabric;


    @Override
    public void init() throws ServletException {
        super.init();
        questFabric = new QuestFabric();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String questName = req.getParameter("questName");
        if(quest == null){
            quest = questFabric.createQuest(questName);
        }

        String answer = req.getParameter("answer");
        if (StringUtils.isEmpty(answer)) {
            answer = quest.getFirstAnswer();
        }

        List<String> variants = quest.getVariants(answer);
        String question = quest.getQuestion(answer);
        String path = quest.getPath(answer);

        req.setAttribute("variants", variants);
        req.setAttribute("question", question);

        RequestDispatcher dispatcher = req.getRequestDispatcher(path);
        dispatcher.forward(req, resp);
    }
}

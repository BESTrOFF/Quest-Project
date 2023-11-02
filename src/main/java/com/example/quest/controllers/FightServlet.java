package com.example.quest.controllers;

import com.example.quest.entity.Enemy;
import com.example.quest.entity.Fight;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet(name = "fight", value = "/fight")
public class FightServlet extends HttpServlet {
    private List<Enemy> enemies;
    private int hp;
    private Fight fight;


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (enemies == null) {
            hp = 100;
            fight = new Fight();
            enemies = fight.getEnemies();

            HttpSession session = req.getSession();
            session.setAttribute("enemies", enemies);
            session.setAttribute("hp", hp);
        }

        String action = req.getParameter("action");
        if (StringUtils.equals(action, "attack")) {
            fight.setEnemies(enemies);
            fight.attack();
            enemies = fight.getEnemies();

            hp = hp - fight.getDmg();
        }

        RequestDispatcher dispatcher;
        String message;

        List<String> variants;
        if (enemies.isEmpty()) {
            message = "You captured the ship and got home";
            variants = new ArrayList<>();
            variants.add("<a href=\"index.jsp\">Try again?</a>");

            dispatcher = req.getRequestDispatcher("WEB-INF/jsps/game.jsp");
            req.setAttribute("variants", variants);
            req.setAttribute("question", message);
            dispatcher.forward(req, resp);
        }

        if (hp <= 0) {
            message = "You die";
            variants = new ArrayList<>();
            variants.add("<a href=\"index.jsp\">Try again?</a>");

            dispatcher = req.getRequestDispatcher("WEB-INF/jsps/game.jsp");
            req.setAttribute("variants", variants);
            req.setAttribute("question", message);
            dispatcher.forward(req, resp);
        }

        req.setAttribute("hp", hp);
        req.setAttribute("enemies", enemies);

        dispatcher = req.getRequestDispatcher("WEB-INF/jsps/fight.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}

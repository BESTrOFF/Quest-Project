package com.example.quest.controllers;

import com.example.quest.db.DB;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {

    RequestDispatcher dispatcher;
    String message;
    DB db;
    HttpSession session;

    @Override
    public void init() throws ServletException {
        super.init();
        db = new DB();
        db.register("q", "w");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("loginButton");
        if (StringUtils.isEmpty(method)) {
            doPost(req, resp);
        } else doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        session = req.getSession();


        if (StringUtils.isNoneEmpty(login, password)) {
            if (db.login(login, password)) {
                session.setAttribute("userName", login);
                session.setAttribute("db", db);
                req.setAttribute("answer", "LostTheMemory");
                dispatcher = req.getRequestDispatcher("game");
                dispatcher.forward(req, resp);
            } else {
                message = "Invalid login or password";
                req.setAttribute("message", message);
                dispatcher = req.getRequestDispatcher("index.jsp");
                dispatcher.forward(req, resp);
            }
        } else {
            message = "some field is empty";
            req.setAttribute("message", message);
            dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        String dbAnswer = db.register(login, password);

        switch (dbAnswer) {
            case ("successfully"):
                session = req.getSession();
                session.setAttribute("userName", login);
                req.setAttribute("answer", "LostTheMemory");
                dispatcher = req.getRequestDispatcher("game");
                dispatcher.forward(req, resp);
                break;

            case ("user already exists"):
                message = "User already exists";
                req.setAttribute("message", message);
                dispatcher = req.getRequestDispatcher("index.jsp");
                dispatcher.forward(req, resp);
                break;
            case ("empty field"):
                message = "some field is empty";
                req.setAttribute("message", message);
                dispatcher = req.getRequestDispatcher("index.jsp");
                dispatcher.forward(req, resp);
                break;
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}

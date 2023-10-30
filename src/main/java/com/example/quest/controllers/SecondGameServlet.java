package com.example.quest.controllers;

import com.example.quest.db.DB;
import com.example.quest.db.DBController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "sgame", value = "/sgame")
public class SecondGameServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBController dbController = new DBController(new DB());
        dbController.register("q", "w");


    }

    @Override
    public void destroy() {
        super.destroy();
    }
}

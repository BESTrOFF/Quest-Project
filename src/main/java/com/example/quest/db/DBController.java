package com.example.quest.db;

public class DBController {
    DB db;

    public DBController(DB db){
        this.db = db;
    }

    public boolean login(String login, String password){
        return db.login(login, password);
    }

    public String register(String login, String password){
        return db.register(login, password);
    }
}

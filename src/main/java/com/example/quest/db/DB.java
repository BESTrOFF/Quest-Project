package com.example.quest.db;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class DB {
    HashMap<String, String> db = new HashMap<>();

    public boolean login(String login, String password) {
        // Если пришли не пустые параметры
        if (StringUtils.isNoneEmpty(login, password)) {
            //Ответ успешной авторизации
            if (db.containsKey(login) && password.equals(db.get(login))) {
                return true;
            }
            // Ответ, если нет такого логина (пользователя) или логин верный, но пароль неверный
            if (!db.containsKey(login) || !password.equals(db.get(login))) {
                return false;
            }
        }

        return false;
    }

    public String register(String login, String password) {
        // Если пришли не пустые параметры
        if (StringUtils.isNoneEmpty(login, password)) {
            //Если в базе нет такого пользователя - добавить пользователя
            if (!db.containsKey(login)) {
                db.put(login, password);
                return "successfully";//Код успешной регистрации
            } else {
                return "user already exists"; //Код ответа, если такой пользователь уже существует
            }
        }
        return "empty field"; // Код ответа, если не был введен логин или пароль
    }
}

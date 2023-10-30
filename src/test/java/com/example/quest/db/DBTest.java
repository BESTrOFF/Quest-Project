package com.example.quest.db;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBTest {
    private static DB db;
    private String login;
    private String password;

    @BeforeAll
    public static void init() {
        db = new DB();
        db.register("login", "password");
    }

    @Test
    public void login_method_when_login_successfully_return_true() {
        login = "login";
        password = "password";

        assertTrue(db.login(login, password));
    }

    @Test
    public void login_method_when_there_is_no_such_login_return_false() {
        login = "noSuchLogin";
        password = "password";

        assertFalse(db.login(login, password));
    }

    @Test
    public void login_method_when_login_is_correct_but_password_not_correct_return_false() {
        login = "login";
        password = "noCorrectPassword";

        assertFalse(db.login(login, password));
    }

    @Test
    public void login_method_when_login_is_empty_return_false(){
        login = "";
        password = "password";

        assertFalse(db.login(login, password));
    }
}
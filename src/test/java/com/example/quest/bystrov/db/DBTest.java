package com.example.quest.bystrov.db;

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
    public void login_method_when_login_is_correct_but_password_isnt_correct_return_false() {
        login = "login";
        password = "noCorrectPassword";

        assertFalse(db.login(login, password));
    }

    @Test
    public void login_method_when_login_is_empty_return_false() {
        login = "";
        password = "password";

        assertFalse(db.login(login, password));
    }

    @Test
    public void login_method_when_password_is_empty_return_false() {
        login = "login";
        password = "";

        assertFalse(db.login(login, password));
    }

    @Test
    public void register_method_when_login_isEmpty_return_empty_field() {
        login = "";
        password = "password";

        String dbAnswer = db.register(login, password);

        assertEquals("empty field", dbAnswer);
    }

    @Test
    public void register_method_when_password_isEmpty_return_empty_field() {
        login = "login";
        password = "";

        String dbAnswer = db.register(login, password);

        assertEquals("empty field", dbAnswer);
    }

    @Test
    public void register_method_when_login_isnt_contains_in_db_return_successfully() {
        login = "otherLogin";
        password = "password";

        assertEquals("successfully", db.register(login, password));
    }

    @Test
    public void register_method_when_login_is_contains_in_db_return_user_already_exists() {
        login = "login";
        password = "password";

        assertEquals("user already exists", db.register(login, password));
    }
}
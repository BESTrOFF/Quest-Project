package com.example.quest.bystrov.entity;

import java.util.Random;

public class Enemy {
    private String name;
    private int hp;

    public Enemy(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int makeDmg(){
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}

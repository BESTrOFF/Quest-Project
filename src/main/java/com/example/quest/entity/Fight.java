package com.example.quest.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fight {
    private List<Enemy> enemies;
    private Random random;

    public Fight() {
        random = new Random();
        enemies = new ArrayList<>();
        Random randomizer = new Random();
        int enemyCount = randomizer.nextInt(4) + 2;
        for (int i = 0; i < enemyCount; i++) {
            int count = i + 1;
            enemies.add(new Enemy("enemy " + count, 10));
        }
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void attack() {
//        int attackedEnemyIndex = random.nextInt(enemies.size()); Если сделать так, то творится какая-то чертовщина
        int dmg = random.nextInt(5) + 5;
        Enemy attackedEnemy = enemies.get(0);
        int enemyHp = attackedEnemy.getHp();

        attackedEnemy.setHp(enemyHp - dmg);

        if (attackedEnemy.getHp() <= 0) {
            enemies.remove(0);
        } else {
            enemies.set(0, attackedEnemy);
        }
    }

    public int getDmg(){
        int dmg = 0;

        for(Enemy enemy : enemies){
            dmg = dmg + enemy.makeDmg();
        }

        return dmg;
    }
}

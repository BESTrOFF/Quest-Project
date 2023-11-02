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
            enemies.add(new Enemy("enemy " + i, 10));
        }
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void attack() {
        int attackedEnemyIndex = random.nextInt(enemies.size());
        int dmg = random.nextInt(5) + 5;
        Enemy attackedEnemy = enemies.get(attackedEnemyIndex);
        int enemyHp = attackedEnemy.getHp();

        attackedEnemy.setHp(enemyHp - dmg);

        if (attackedEnemy.getHp() <= 0) {
            enemies.remove(attackedEnemyIndex);
        } else {
            enemies.set(0, attackedEnemy);
        }
    }
}

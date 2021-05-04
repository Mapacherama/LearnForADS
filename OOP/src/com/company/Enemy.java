package com.company;

public class Enemy {

    private int health;

    public void Talk() {
        System.out.println("I'm a really scary enemy, hear me roar: *coughs* rooooooaaaarrrr!!!");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

package com.quantumtopia.krauser.wowapp;

/**
 * Created by Krauser on 8/23/2016.
 */
public class Target
{
    private int number;
    private int max_health;
    private int current_health;
    private float health_percentage;
    private boolean alive;
    private String name;

    public Target(int health)
    {
        max_health = health;
        number = 1;
        alive = true;
    }

    public Target(int health, int number)
    {
        max_health = health;
        this.number = number;
        alive = true;
    }

    public boolean take_damage(int damage)
    {
        current_health -= damage;
        return current_health > 0;
    }
}

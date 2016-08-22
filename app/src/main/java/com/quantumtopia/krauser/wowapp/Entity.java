package com.quantumtopia.krauser.wowapp;

import java.util.Vector;

/**
 * Created by Krauser on 8/22/2016.
 */
public class Entity
{
    private int max_health;
    private int health;
    private float health_percentage;
    private Vector<Aura> Auras;
    private Vector<Ability> Abilities;

    public Entity(int hp)
    {
        max_health = hp;
        health = hp;
        health_percentage = 100;
    }

    public void lose_health(int h)
    {
        health -= h;
        update_percentage();
    }

    public void lose_health(float h)
    {
        health_percentage -= h;
        update_health();
    }

    public void set_health(int h)
    {
        health = h;
        update_percentage();
    }

    public void set_health(float h)
    {
        health_percentage = h;
        update_health();
    }

    private void update_health()
    {
        health = Math.round(max_health * health_percentage / 100);
    }

    private void update_percentage()
    {
        health_percentage = health / max_health * 100;
    }
}

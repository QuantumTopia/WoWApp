package com.quantumtopia.krauser.wowapp;

/**
 * Created by Krauser on 8/23/2016.
 */
public class DamageAbility
{
    private int direct_damage;
    private int dot_damage;
    private float cast_time;
    private boolean first_tick;
    private float remaining_time;
    private float time_until_next_tick;

    public DamageAbility()
    {

    }

    public int getDirectDamage()
    {
        // TODO apply scaling
        return direct_damage;
    }

    public int getDotDamage()
    {
        remaining_time -= time_until_next_tick;
        if(first_tick)
        {
            first_tick = false;
            return 0;
        }
        // TODO apply scaling
        return dot_damage;
    }

    public boolean is_done()
    {
        if(remaining_time <= 0)
            return true;
        return false;
    }
}

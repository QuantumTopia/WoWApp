package com.quantumtopia.krauser.wowapp;

/**
 * Created by Krauser on 8/23/2016.
 */
public class Stats
{
    private int[] stat_values;

    public Stats()
    {
        stat_values = new int[9];
    }
    
    public void set_stat(int stat_name, int value)
    {
        stat_values[stat_name] = value;
    }

    public int get_stat(int stat_name)
    {
        return stat_values[stat_name];
    }
}

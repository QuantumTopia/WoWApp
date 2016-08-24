package com.quantumtopia.krauser.wowapp;

import java.util.List;
import java.util.Queue;

/**
 * Created by Krauser on 8/23/2016.
 */
public class Encounter
{
    private List<Target> targets;
    private List<DamageAbility> abilities;
    private Player player;
    public static float current_time;
    private int total_time;
    private Target current_target;
    private DamageAbility current_ability;

    public Encounter()
    {

    }

    private void advance_time()
    {
    }
}

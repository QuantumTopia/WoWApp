package com.quantumtopia.krauser.wowapp;

/**
 * Created by Krauser on 8/23/2016.
 */
public class AbilityQueueElement
{
    private DamageAbility ability;
    private float application_time;
    private Target target;

    public AbilityQueueElement()
    {

    }

    public boolean advance()
    {
        if(Encounter.current_time < application_time) return false; // whether it should be removed from q

        int dir_damage = ability.getDirectDamage();
        int dot_damage = ability.getDotDamage();

        if(dir_damage > 0)
            target.take_damage(dir_damage);

        if(dot_damage <= 0) return true; // remove from queue

        target.take_damage(ability.getDotDamage());
        return ability.is_done();
    }
}

package com.quantumtopia.krauser.wowapp;

import java.util.Queue;

/**
 * Created by Krauser on 8/23/2016.
 */
public class Encounter
{
    private Queue<AbilityQueueElement> ability_queue;
    public static float current_time;
    private int total_time;

    public Encounter()
    {

    }

    private void advance_time()
    {
        // add ability to queue
        // advance time by 0.1s
            // apply all abilities in queue before current time
                // remove those abilities
        // check if encounter is over
            // current time >= total_time
            // all targets dead
    }
}

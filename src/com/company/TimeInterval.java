package com.company;


public class TimeInterval {
    public int time;

    public TimeInterval(int time) {
        this.time = time;
    }

    public boolean overlapsWith (TimeInterval interval){
        if (this.time == interval.time)
        {
            return true;
        }
        return false;
    }
}

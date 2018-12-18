package com.company;

public class Appointment {
    public TimeInterval interval1;

    public Appointment(int interval2){
        interval1 = new TimeInterval(interval2) ;
    }

    public TimeInterval getTime(){
        return interval1;
    }

    public boolean conflictsWith(Appointment other)
    {

        if(this.interval1.overlapsWith(other.getTime()))
        {
            return true;
        }
        return false;
    }

}

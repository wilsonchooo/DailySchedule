package com.company;

public class Appointment {

    public boolean conflictsWith(Appointment other)
    {
        return getTime().overlapsWith(other.getTime());
    }

    public void clearConflicts(Appointment appt)
    {
        int i = 0;
        while (i < apptList.size())
        {
            if (appt.conflictsWith((Appointment)(apptList.get(i))))
            {
                apptList.remove(i);
            }
            else
            {
                i++;
            }
        }
    }
}

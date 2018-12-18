package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DailySchedule {
    private ArrayList<Appointment> apptList;

    public DailySchedule(int[] APPOINTMENTS)
    {
        apptList = new ArrayList();
    }
    public void clearConflicts(Appointment appt){
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

    public boolean addAppt(Appointment appt, boolean emergency){
        if(emergency)
        {
            clearConflicts(appt);
            apptList.add(appt);
            return true;
        }
        for(int i = 0; i <apptList.size() ; i++){
            if(apptList.get(i).conflictsWith(appt)){
                return false;
            }
        }
        apptList.add(appt);
        return true;
    }
}


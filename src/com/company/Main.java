package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] appt = {1, 2, 500, 27, 39};

        System.out.println(Arrays.toString(appt));

        DailySchedule mySchedule = new DailySchedule(appt);


        System.out.println("What time would you like to add? ");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        System.out.println("Is it an emergency?");
        String emergency = scanner.nextLine();
        if (emergency.equals("yes") || emergency.equals("y"))
        {
            mySchedule.addAppt(new Appointment(time), true);
        }
        else
        {
            mySchedule.addAppt(new Appointment(time), true);
        }





        mySchedule.addAppt(new Appointment(time), false);
    }
}
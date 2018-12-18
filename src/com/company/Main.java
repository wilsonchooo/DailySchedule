package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] appt = {1, 2, 500, 27, 39};

        System.out.println(Arrays.toString(appt));

        DailySchedule schedule = new DailySchedule(appt);


        System.out.println("What time would you like to add? ");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        System.out.println("Is it an emergency?");
        scanner = new Scanner(System.in);

        String emergency = scanner.nextLine();

        if (emergency.equals("yes") || emergency.equals("y"))
        {
            schedule.addAppt(new Appointment(time), true);
            System.out.println("Emergency Appointment at " + time +" added");
        }
        else
        {
            schedule.addAppt(new Appointment(time), false);
            System.out.println(" Appointment at " + time +" added");

        }





    }
}
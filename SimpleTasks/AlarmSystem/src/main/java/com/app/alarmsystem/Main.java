package com.app.alarmsystem;

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temperature too high");
        alarm.turnOn();
        alarm.snooze();
        Thread.sleep(1000 * 10);
        alarm.sendReport();

    }
}

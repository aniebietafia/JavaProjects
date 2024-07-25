package com.app.alarm;

import java.time.LocalDateTime;

class Alarm {
    boolean active;
    final String message;
    LocalDateTime snoozeUntil;

    Alarm(String message) {
        this.message = message;
        stopSnoozing();
    }

    String getMessage() {
        return message;
    }

    void turnOn() {
        active = true;
    }

    void turnOff() {
        active = false;
    }

    void snooze() {
        snoozeUntil = LocalDateTime.now().plusMinutes(5);
    }

    boolean isSnoozing() {
        return snoozeUntil.isAfter(LocalDateTime.now());
    }

    private void stopSnoozing() {
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }

    public String getReport(boolean uppercase) {
        if (active && !isSnoozing()) {
           return uppercase ? message.toUpperCase() : message;
        } else {
            return "";
        }
    }

    void sendReport() {
        System.out.println(getReport(true));
    }

    public static void main(String[] args) throws InterruptedException {
        Alarm alarm = new Alarm("Temperature too high");
        alarm.turnOn();
        alarm.snooze();
        Thread.sleep(60000 * 6);
        alarm.sendReport();
    }
}


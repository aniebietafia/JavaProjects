package com.app.alarm;

import java.time.LocalDateTime;

class Alarm {
    private boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;

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
        if (active)
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
}


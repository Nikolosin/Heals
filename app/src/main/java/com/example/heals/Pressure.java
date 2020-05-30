package com.example.heals;

import java.util.Date;

public class Pressure {
    int up;
    int down;
    int pulse;
    boolean tachycardia;
    Date date;


    public Pressure(int up, int down, int pulse, boolean tachycardia, Date date) {
        this.up = up;
        this.down = down;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
        this.date = date;
    }
}

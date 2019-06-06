package com.example.jokebot;

import android.util.Log;

public class Bot {
    public final String creatorName="Sprawks";
    private String name = "ROBOT";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public final void talk(String whatToSay)
    {
        Log.e(getName(),whatToSay);
    }
}

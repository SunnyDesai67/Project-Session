package com.training;

public class TennisCoach implements ScoreBoard{

    SportsKit kit;

    public void setKit(SportsKit kit) {  //setter based DI
        this.kit = kit;
    }

    @Override
    public String Play() {
        return "Hi, I'm Playing tennis.";
    }

    @Override
    public String KitGranted() {
        return kit.KitGranted();
    }
}

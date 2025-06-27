package com.codex.patterns.behavioral.observer;

public class ObserverChannelZee extends CricketObserver {
    public ObserverChannelZee(CricketScore cricScore) {
        this.cricketscore = cricScore;
        this.cricketscore.attach(this);
    }

    @Override
    public void updateScore() {
        System.out.println("CricketObserverChannelZee :: Updated Score is " + cricketscore.getScore());
    }
}

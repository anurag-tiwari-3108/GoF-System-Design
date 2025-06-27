package com.codex.patterns.behavioral.observer;

public class ObserverChannelSony extends CricketObserver {
    public ObserverChannelSony(CricketScore cricScore) {
        this.cricketscore = cricScore;
        this.cricketscore.attach(this);
    }

    @Override
    public void updateScore() {
        System.out.println("CricketObserverChannelSony :: Updated Score is " + cricketscore.getScore());
    }
}

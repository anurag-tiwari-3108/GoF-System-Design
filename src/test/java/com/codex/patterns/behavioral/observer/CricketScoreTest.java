package com.codex.patterns.behavioral.observer;

import org.junit.Test;
import static org.junit.Assert.*;

public class CricketScoreTest {
    @Test
    public void testInitialScore() {
        CricketScore score = new CricketScore();
        assertEquals(0, score.getScore());
    }
    
    @Test
    public void testSetScore() {
        CricketScore score = new CricketScore();
        score.setScore(42);
        assertEquals(42, score.getScore());
    }
}

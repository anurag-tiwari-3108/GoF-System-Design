package com.codex.patterns.behavioral.chainofresponsibility;

// Layman Example: Help Desk Support Chain
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();
        level1.setNext(level2);
        level2.setNext(level3);

        level1.handleRequest("password reset");
        level1.handleRequest("software install");
        level1.handleRequest("network issue");
    }
}

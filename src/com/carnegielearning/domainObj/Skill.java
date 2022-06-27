package com.carnegielearning.domainObj;

public class Skill {
    private String description;
    private int score;

    public Skill(String description) {
        this.description = description;
        this.score = 0;
    }

    public void sumScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }

    public String getDescription() {
        return description;
    }
}

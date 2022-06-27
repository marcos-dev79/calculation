package com.carnegielearning.domainObj;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    private String problemDescription;
    private List<Skill> skills;
    private Boolean isComplete;
    private Integer points;

    public Problem(String problemDescription) {
        this.problemDescription = problemDescription;
        this.isComplete = Boolean.FALSE;
        this.points = 5;
        this.skills = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    public void setIsComplete(){
        this.isComplete = Boolean.TRUE;
    }

    public Boolean isComplete() {
        return isComplete;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public String getProblemDescription() {
        return problemDescription;
    }
}

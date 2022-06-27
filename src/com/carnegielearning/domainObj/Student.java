package com.carnegielearning.domainObj;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Skill> skills;

    public Student(String name) {
        this.name = name;
        this.skills = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    public List<Skill> getSkills() {
        return skills;
    }
}

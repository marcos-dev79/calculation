package com.carnegielearning.Rules;

import com.carnegielearning.domainObj.Problem;
import com.carnegielearning.domainObj.Skill;
import com.carnegielearning.domainObj.Student;

import java.util.List;

public class Calculation {
    public void calculate(Student student, List<Problem> problemList, int threshold) {
        // Which problem shall we return?
        Problem selected = null;

        for (Skill s : student.getSkills()) {
            if(s.getScore() < threshold) {
                for (Problem p : problemList) {
                    List<Skill> problemSkills = p.getSkills();
                    for (Skill probskill : problemSkills) {
                        if(probskill.getDescription() == s.getDescription() && !p.isComplete()) {
                            selected = p;
                            p.setIsComplete();
                            System.out.println(selected.getProblemDescription());
                        }
                    }
                }
            }
        }
    }
}

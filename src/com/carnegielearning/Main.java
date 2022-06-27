package com.carnegielearning;

import com.carnegielearning.Rules.Calculation;
import com.carnegielearning.domainObj.Problem;
import com.carnegielearning.domainObj.Skill;
import com.carnegielearning.domainObj.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {


    /**
     * @author Marcos Riso
     * @param args
     */
    public static void main(String[] args) {
        // This sets the threshold to analise
        int threshold = 90;

        // First, let's set the skills
        Skill addDecimals = new Skill("add-decimals");
        Skill multiplyDecimals = new Skill("multiply-decimals");
        Skill addFractions = new Skill("add-fractions");
        Skill multiplyFractions = new Skill("multiply-fractions");

        // Then, let's create the problems
        Problem prob1 = new Problem("prob1");
        prob1.addSkill(addDecimals);

        Problem prob2 = new Problem("prob2");
        prob2.addSkill(addDecimals);
        prob2.addSkill(multiplyDecimals);


        Problem prob3 = new Problem("prob3");
        prob3.addSkill(addFractions);

        Problem prob4 = new Problem("prob4");
        prob4.addSkill(addFractions);
        prob4.addSkill(multiplyFractions);

        // Let's add the problems to a list. In real world, it may come from a database.
        List<Problem> problemList = new ArrayList<>();
        problemList.add(prob1);
        problemList.add(prob2);
        problemList.add(prob3);
        problemList.add(prob4);

        /**
         * Our brave little student and its points
         * When you set the points differently, the response will be different
          */

        Student student = new Student("Marcos");
        addDecimals.sumScore(30);
        multiplyDecimals.sumScore(95);
        addFractions.sumScore(95);
        multiplyFractions.sumScore(95);

        student.addSkill(addDecimals);
        student.addSkill(multiplyDecimals);
        student.addSkill(addFractions);
        student.addSkill(multiplyFractions);


        /**
         * Some piece of logic here.
         *  I tried to keep it simple.
         */
        Calculation cal = new Calculation();
        cal.calculate(student, problemList, threshold);

    }



}

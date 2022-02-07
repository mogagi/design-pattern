package com.mblin.oo.template;

import java.util.List;

public class PlusMinusGradeReporter extends GradeReporterTemplate {

    @Override
    protected String numToLetter(Double grade) {
        if (grade <= 5.0 && grade > 4.7) return "A";
        else if (grade <= 4.7 && grade > 4.3) return "A-";
        else if (grade <= 4.3 && grade > 4.0) return "B+";
        else if (grade <= 4.0 && grade > 3.7) return "B";
        else if (grade <= 3.7 && grade > 3.3) return "B-";
        else if (grade <= 3.3 && grade > 3.0) return "C+";
        else if (grade <= 3.0 && grade > 2.7) return "C";
        else if (grade <= 2.7 && grade > 2.3) return "C-";
        else if (grade <= 2.3 && grade > 0.0) return "D";
        else if (grade == 0.0) return "F";
        else return "N/A";
    }

    @Override
    protected void printGradeReport(List<String> grades) {
        grades.stream().map(g -> "Grade is: " + g).forEach(System.out::println);
    }

    public static void main(String[] args) {
        var grades = List.of(5.0, 4.0, 4.4, 2.2, 3.3, 3.5);
        new PlusMinusGradeReporter().reportGrades(grades);
    }
}
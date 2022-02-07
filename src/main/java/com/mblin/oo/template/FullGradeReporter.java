package com.mblin.oo.template;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class FullGradeReporter extends GradeReporterTemplate {

    @Override
    public String numToLetter(Double grade) {
        if (grade <= 5.0 && grade > 4.0) return "A";
        else if (grade <= 4.0 && grade > 3.0) return "B";
        else if (grade <= 3.0 && grade > 2.0) return "C";
        else if (grade <= 2.0 && grade > 0.0) return "D";
        else if (grade == 0.0) return "F";
        else return "N/A";
    }

    @Override
    protected void printGradeReport(List<String> grades) {
        var gradeCounts = new TreeMap<String, Integer>();
        grades.forEach(grade -> gradeCounts.put(grade, gradeCounts.getOrDefault(grade, 0) + 1));
        gradeCounts.forEach((k, v) -> {
            var bar = new StringBuffer();
            IntStream.range(0, v).forEach(i -> bar.append("*"));
            System.out.printf("%s: %s\n", k, bar);
        });
    }

    public static void main(String[] args) {
        var grades = List.of(5.0, 4.0, 4.4, 2.2, 3.3, 3.5);
        new FullGradeReporter().reportGrades(grades);
    }
}
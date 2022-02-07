package com.mblin.oo.template;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Replacing Template Method.
 * To specify the outline of an algorithm, letting callers plug in some of the specifics
 *
 * @author casa
 * @since 2022/2/7 19:41
 */
public abstract class GradeReporterTemplate {

    public void reportGrades(List<Double> grades) {
        var convertedGrades = grades.stream().map(this::numToLetter).collect(Collectors.toList());
        printGradeReport(convertedGrades);
    }

    protected abstract String numToLetter(Double grade);

    protected abstract void printGradeReport(List<String> grades);
}
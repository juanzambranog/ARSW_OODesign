package com.example.OODesign;


public class Statistics {

    public static double mean(LinkedList<Double> data) {
        double sum = 0.0;
        int n = data.size();
        for (Double x : data) {
            sum += x;
        }
        return sum / n;
    }

    public static double standardDeviation(LinkedList<Double> data) {
        double mean = mean(data);
        double sumSquaredDiffs = 0.0;
        int n = data.size();
        for (Double x : data) {
            sumSquaredDiffs += Math.pow(x - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / (n - 1));
    }
}

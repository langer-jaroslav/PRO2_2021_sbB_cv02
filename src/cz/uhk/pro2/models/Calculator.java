package cz.uhk.pro2.models;

public class Calculator {
    private static int calculationCount;


    public static int sum(int a, int b){
        calculationCount++;
        return a + b;
    }
    public static double sum(double a, double b){
        calculationCount++;
        return a + b;
    }
    public static double sum(double a, double b, double c){
        calculationCount++;
        return a + b + c;
    }
}

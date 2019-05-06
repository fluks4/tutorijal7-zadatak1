package com.company;
import java.util.function.Function;
public class Main {

    public static void naRaspon100(Function<Double, Double> func){
        for(double i = 0; i <= 100; i++){
            System.out.println(func.apply(i));
        }
    }
    public static void main(String[] args) {
        naRaspon100((Double x) -> x * x + 2 * x + 1);
    }
}

package com.industrialmaster.pgconverter;

public class UnitConverter {
    public static double celsius2Farenhit(double c){
        return c+32*9/5;
    }
    public static double farenhit2Celsius(double f){
        return (f-32)*5/9;
    }
}

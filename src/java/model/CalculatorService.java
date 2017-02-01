/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ryan Schissel
 */
public class CalculatorService {
    public final double calculateArea(double base, double height) throws Exception{
        return base * height;
    }
    public final double calculateArea(double base, double height, double divisor)throws Exception{
        return (base*height) / divisor;
    }
    public final double calculateArea(double radius)throws Exception{
        return 2 * Math.PI * radius;
    }
    public final double calculateArea(double topBase, double bottomBase, double height, double divisor)throws Exception{
        return ((topBase + bottomBase) / divisor) * height;
    }
}

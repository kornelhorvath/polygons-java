/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import static java.lang.Math.sqrt;

/**
 *
 * @author Kornel
 */
public class Triangle extends Polygon {
    private double sideLength;
    
    public Triangle(double x, double y, double sideLength){
        super(x, y);
        this.sideLength = sideLength;
    }
    
    protected double getRectangle() {
        double height = this.sideLength * 0.5 * sqrt(3);
        return height * sideLength;
    }
    
    @Override
    public String toString(){
        return "I'm a Triangle";
    }
}

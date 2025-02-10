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
public class Hexagon extends Polygon {
    private double sideLength;
    
    public Hexagon(double x, double y, double sideLength){
        super(x, y);
        this.sideLength = sideLength;
    }
    
    protected double getRectangle() {
        double width = sideLength * 2;
        double height = this.sideLength * 0.5 * sqrt(3) * 2;
        return width * height;
    }
    
    @Override
    public String toString(){
        return "I'm a Hexagon";
    }
}

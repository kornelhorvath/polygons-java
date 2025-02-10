/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Kornel
 */
public class Circle extends Polygon {
    private double radius;
    
    public Circle(double x, double y, double radius){
        super(x, y);
        this.radius = radius;
    }
    
    protected double getRectangle() {
        double diameter = this.radius * 2;
        return diameter * diameter;
    }
    
    @Override
    public String toString(){
        return "I'm a Circle";
    }
}

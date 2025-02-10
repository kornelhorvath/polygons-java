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
public class Square extends Polygon {
    private double sideLength;
    
    public Square(double x, double y, double sideLength){
        super(x, y);
        this.sideLength = sideLength;
    }
    
    protected double getRectangle() {
        return this.sideLength * this.sideLength;
    }
    
    @Override
    public String toString(){
        return "I'm a Square";
    }
}

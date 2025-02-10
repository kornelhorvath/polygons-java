/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.awt.geom.Point2D;

/**
 *
 * @author Kornel
 */
public abstract class Polygon {
    protected Point2D.Double center;
    
    public Polygon(double x, double y){
        this.center = new Point2D.Double(x, y);
    }
    
    abstract protected double getRectangle();
    
    @Override
    public String toString(){
        return "I'm a Polygon";
    }
}

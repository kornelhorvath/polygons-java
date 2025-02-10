/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kornel
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Toggle testing
        final boolean TEST_MODE = true;
        
        if(!TEST_MODE){
            List<Polygon> polygons = new ArrayList<>(); 
            try{
                File file = new File("./src/Assignment1/infile.txt");
                Scanner reader = new Scanner(file);
                String line = reader.nextLine();
                while(reader.hasNextLine()){
                    line = reader.nextLine();
                    String[] s = line.split(" ");
                    switch(s[0]){
                        case "c":
                            polygons.add(new Circle(Double.valueOf(s[1]), Double.valueOf(s[2]), Double.valueOf(s[3])));
                            break;
                        case "t":
                            polygons.add(new Triangle(Double.valueOf(s[1]), Double.valueOf(s[2]), Double.valueOf(s[3])));
                            break;
                        case "s":
                            polygons.add(new Square(Double.valueOf(s[1]), Double.valueOf(s[2]), Double.valueOf(s[3])));
                            break;
                        case "h":
                            polygons.add(new Hexagon(Double.valueOf(s[1]), Double.valueOf(s[2]), Double.valueOf(s[3])));
                            break;
                        default:
                            break;
                    }
                }
                int index = 1;
                int maxIndex = 0;
                for(Polygon p : polygons.subList(1, polygons.size())){
                    double rect = p.getRectangle();
                    if(rect > polygons.get(maxIndex).getRectangle()){
                        maxIndex = index;
                    }
                    ++index;
                }
                System.out.println("Biggest bounding rectangle is: " + polygons.get(maxIndex));
            } catch(Exception e){
                System.out.println(e);
            }
        }
        
        //Tests
        if(TEST_MODE){
            final double THRESHOLD = .1;
            //Test 1
            try {
                Polygon p1 = new Square(0, 0, 10);
                double expected1 = 100.0;
                if(Math.abs(p1.getRectangle() - expected1) < THRESHOLD){
                    System.out.println("Test 1: pass");
                } else {
                    System.out.println("Test 1: failed");
                }
            } catch (Exception e){
                System.out.println("Test 1: failed with exception\n" + e.getMessage());
            }
            //Test 2
            try {
                Polygon p2 = new Triangle(0, 0, 10);
                double expected2 = 86.6;
                if(Math.abs(p2.getRectangle() - expected2) < THRESHOLD){
                    System.out.println("Test 2: pass");
                } else {
                    System.out.println("Test 2: failed");
                }
            } catch (Exception e){
                System.out.println("Test 2: failed with exception\n" + e.getMessage());
            }
            //Test 3
            try {
                Polygon p3 = new Hexagon(0, 0, 10);
                double expected3 = 346.4;
                if(Math.abs(p3.getRectangle() - expected3) < THRESHOLD){
                    System.out.println("Test 3: pass");
                } else {
                    System.out.println("Test 3: failed");
                }
            } catch (Exception e){
                System.out.println("Test 3: failed with exception\n" + e.getMessage());
            }
            //Test 4
            try {
                Polygon p4 = new Circle(0, 0, 10);
                double expected4 = 400.0;
                if(Math.abs(p4.getRectangle() - expected4) < THRESHOLD){
                    System.out.println("Test 4: pass");
                } else {
                    System.out.println("Test 4: failed");
                }
            } catch (Exception e){
                System.out.println("Test 4: failed with exception\n" + e.getMessage());
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akm.rlmca132.oop.java.lab3;

/**
 *
 * @author admin
 */
public class PointClass {
    
    int x;
    int y;
    PointClass ( int x, int y)
    {
        x = x;
        y = y;
    }
    void displayPoint ( ) {
        System.out.println ("The x value is" + x);
        System.out.println ("The y value is" + y);
        }
    public static void main ( String arg [ ] ) {
        PointClass point = new PointClass(10,20);
        point. displayPoint ( );
    }
}
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

// using this keyword
public class ThisReturnClass {
    
    private int i = 0;
    ThisReturnClass increment()
    {
        i++;
        return this ;
    }
    void print(){
        System.out.println ("The i value is" + i);
    }
    public static void main (String arg[])
    {
        ThisReturnClass tr = new ThisReturnClass();
        tr.increment().increment().increment().increment().increment().print();
    }
}
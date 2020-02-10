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
class CallByValue
{
    public static void main (String args[])
    {
        TestByVal ob = new TestByVal();
        int a =15, b = 20;
        System.out.println ("Before call :a = "+ a +"b = " + b);
        ob.meth (a, b );
        System.out.println ("After call :a = " + a+" b = " + b );
    }
}

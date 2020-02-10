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

class TestByRef2 {
    int a, b;
    TestByRef2(int i, int j)
    {
        a = i;
        b = j;
    }
    // pass an object
    void meth(TestByRef2 o){
       o.a *=2;
       o.b /= 2;
       }   
}

public class CallByRef2 {
     public static void main(String args[])
    {
        TestByRef2 ob = new TestByRef2(15,20);
        System.out.println("Before call :ob.a = "+ob.a+" ob.b "+ob.b);
        ob.meth (ob);
        System.out.println("After call :ob.a = "+ob.a+" ob.b "+ ob.b);
    }
}

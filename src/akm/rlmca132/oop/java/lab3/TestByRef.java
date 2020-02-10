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
public class TestByRef {
    int a, b;
    TestByRef(int i, int j)
    {
        a = i;
        b = j;
    }
    // pass an object
    void meth(TestByRef o){
       o.a *=2;
       o.b /= 2;
       }   
}

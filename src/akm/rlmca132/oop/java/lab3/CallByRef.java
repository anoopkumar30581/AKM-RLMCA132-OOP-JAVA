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
class CallByRef
{
    public static void main(String args[])
    {
        TestByRef ob = new TestByRef(15,20);
        System.out.println("Before call :ob.a = "+ob.a+" ob.b "+ob.b);
        ob.meth (ob);
        System.out.println("After call :ob.a = "+ob.a+" ob.b "+ ob.b);
    }
}

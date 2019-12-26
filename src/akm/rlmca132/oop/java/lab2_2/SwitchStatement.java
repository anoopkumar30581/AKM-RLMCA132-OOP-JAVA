/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akm.rlmca132.oop.java.lab2_2;

/**
 *
 * @author admin
 */
public class SwitchStatement {
    public static void main (String args [ ] )
    {
        char ch = 'A';
        switch (ch)
        {
            case 'A':
                System.out.println ("Value is A");
                break;
            case 'B':
                System.out.println ("Value is B");
                break;
            default:
                System.out.println ("Unknown Value");
        }
    }
}

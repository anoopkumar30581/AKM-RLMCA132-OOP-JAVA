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
class BreakLoop
{
    public static void main (String args [ ])
    {
        int i= 0;
        do {
            System.out.println ("I’m stuck !" ) ;
            i++;
            if (i > 5)
                break;
        } while (true);
    }
}

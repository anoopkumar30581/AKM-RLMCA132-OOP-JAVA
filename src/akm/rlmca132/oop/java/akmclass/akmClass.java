/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akmclass;

import akmpackage.MyClass;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class akmClass {

    public static void main(String args[]) {
        String Name;

        MyClass miC;
        miC = new MyClass();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter username");
        
        Name = myObj.nextLine();
        miC.getNames(Name);
    }

}

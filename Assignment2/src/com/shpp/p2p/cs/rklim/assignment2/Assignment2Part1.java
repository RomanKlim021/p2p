package com.shpp.p2p.cs.rklim.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    public void run(){

        double a=readInt("Please enter a: ");
        while (a == 0){
            println("Your number can't be a zero, try again");
            a = readInt();
        }
        double b = readInt("Please enter b: ");
        double c = readInt("Please enter c: ");

        double discriminant  = Math.pow(b, 2) - 4 * a * c;

        println("a= " + a + " b= " + b + " c= " + c);
        println("discriminant = " + discriminant );

        if(discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant )) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant )) / (2 * a);
            println("There are two roots: " + x1 + " and " + x2);
        }
        else if(discriminant < 0) {
            println("There are no real roots");
        }
        else{
            double x= -b / (2*a);
            println("There is one root: " + x);
        }

    }
}


package com.shpp.p2p.cs.rklim.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot {

    // Background: Karel stands in the lower corner and looks east
    // Result: Karel finds the middle or if map is 1x1 marks it
    public void run() throws Exception {
        if(frontIsClear() && leftIsClear()){
            findMidPoint();
        }
        else
        putBeeper();
    }

    // Background: Karel stands in the lower corner and looks east
    // Result: Karel finds the middle of the South Line, puts a beeper and looks West
        public void findMidPoint() throws Exception {
           goToUpperCut();
           goDown();
           goToMiddle();
           goDown();
           putBeeper();
           pickBeepers();
           goToPoint();
        }

    // Background: Karel stands in the lower corner and looks east
    // Result: Karel moves to the Northeast corner, forms a line and looks to the South
    private void goToUpperCut() throws Exception {
        while (frontIsClear()) {
            if (noBeepersPresent()) {
                putBeeper();
                zigZagPut();
            }
        }
        putBeeper();
        turnRight();
    }

    // Karel moves until he hits a wall
    private void goDown() throws Exception {
        while (frontIsClear()){
            move();
        }
    }
    // Prerequisites: Karel stands in the Southeast corner and looks to the South
    // Result: Karel moves to the middle of the line, makes a U-turn and looks South
    private void goToMiddle() throws Exception {
        turnAround();
        while (noBeepersPresent()) {
            turnLeft();
            move();
            turnRight();
            move();
        }
        turnAround();
    }

    // Prerequisites: Karel stands in the Southwest corner and looks to the West
    // Result: Karel moves along the line and erases it, stops at the end and looks east
    private void pickBeepers() throws Exception {
        turnRight();
        while (frontIsClear()){
            move();
        }
        turnAround();
            while (frontIsClear()) {
                if (beepersPresent()) {
                    pickBeeper();
                    zigZagPick();
                }
            }
            pickBeeper();
        }

    // Prerequisites: Karel stands in the Northeast corner and looks to the East
    // Result: Karel moves to and stops at the beeper
    private void goToPoint() throws Exception {
        turnRight();
        while (noBeepersPresent()){
            move();
            if(frontIsBlocked()){
                turnRight();
            }
        }
    }

    // Karel moves in a bend and puts a beeper
    private void zigZagPut() throws Exception{
        turnLeft();
        move();
        putBeeper();
        turnRight();
        move();
    }

    // Karel moves in a bend and picks up a beeper
    private void zigZagPick() throws Exception{
        turnLeft();
        move();
        pickBeeper();
        turnRight();
        move();
    }

    // Karel turns right
    private void turnRight() throws Exception {
        for(int i=0; i<3; i++){
            turnLeft();
        }
    }

    // Karel turn around
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }
}






package com.shpp.p2p.cs.rklim.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {

    // Prerequisites: Karel stands in the Southwestern corner and looks east
    // Result: Karel passes all columns and restores them
    public void run() throws Exception{
        while (frontIsClear()) {
            repairColumn();
            moveToNextColumn();
        }
        repairColumn();
    }

    // Karel restores the column and returns to the beginning
    private void repairColumn() throws Exception {
            putBeepers();
            goToBottom();
    }

    // Prerequisites: Karel looks east
    // Result: Karel moves up to the end of the column and restores it
    private void putBeepers() throws Exception {
        if(frontIsClear() && (leftIsBlocked())){
            putBeeper();
            turnLeft();
        } else {
            turnLeft();
            if (noBeepersPresent()) {
                putBeeper();
            }
            while (frontIsClear()) {
                move();
                while (noBeepersPresent()) {
                    putBeeper();
                }
            }
        }
    }

    // Prerequisites: Karel stands at the top of the column and looks north
    // Result: It returns to the beginning of the column and returns to the West
    private void goToBottom() throws Exception {
        turnAround();
        if (!frontIsBlocked()) {
            while (frontIsClear()) {
                move();
            }
        }
        turnLeft();
    }

    // Karel moves on to the next column
    private void moveToNextColumn() throws Exception{
        for(int i=0; i<4; i++) {
            if (frontIsClear()) {
                move();
            }
        }
    }

    // Karel turn around
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }
}

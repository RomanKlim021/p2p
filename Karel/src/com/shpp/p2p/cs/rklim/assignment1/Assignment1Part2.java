package com.shpp.p2p.cs.rklim.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {

    public void run() throws Exception{
        while (frontIsClear()) {
            repairColumn();
            moveToNextColumn();
        }
        repairColumn();
    }

    private void repairColumn() throws Exception {
            putBeepers();
            goToBottom();
    }

    private void goToBottom() throws Exception {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }

    private void putBeepers() throws Exception {
        if(frontIsClear() && (leftIsBlocked())){
            putBeeper();
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

    private void moveToNextColumn() throws Exception{
        for(int i=0; i<4; i++){
            move();
        }
    }
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();

    }
}

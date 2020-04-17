package com.shpp.p2p.cs.rklim.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot {

    public void run() throws Exception {
        if(frontIsClear() && leftIsClear()){
            findMidPoint();
        }
        else
        putBeeper();
    }

        public void findMidPoint() throws Exception {
           goToUpperCut();
           goDown();
           goToMiddle();
           goDown();
           putBeeper();
           pickBeepers();
        }

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

        private void zigZagPut() throws Exception{
            turnLeft();
            move();
            putBeeper();
            turnRight();
            move();
        }

    private void zigZagPick() throws Exception{
        turnLeft();
        move();
        pickBeeper();
        turnRight();
        move();
    }

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

        private void turnRight() throws Exception {
            for(int i=0; i<3; i++){
                turnLeft();
            }
        }

        private void goDown() throws Exception {
            while (frontIsClear()){
                move();
            }
        }
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

        private void turnAround() throws Exception {
            turnLeft();
            turnLeft();
        }

}






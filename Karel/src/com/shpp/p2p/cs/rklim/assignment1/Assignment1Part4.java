package com.shpp.p2p.cs.rklim.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part4 extends KarelTheRobot {

    public void run() throws Exception {
        createMap();
    }
    public void createMap() throws Exception {
        while (frontIsClear()) {
            pickAndPutFirst();
            goNextRaw();
            pickAndPutSecond();
            goNextRaw();
            }
        }

    private void goNextRaw() throws Exception {
        turnAround();
        goToFirst();
        changeTheRaw();
    }


    private void goToFirst() throws Exception {
        while (frontIsClear()){
            move();
        }
    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    private void pickAndPutFirst() throws Exception {
        while (frontIsClear()) {
            pickBeepers();
            putBeepers();
            move();
            pickBeepers();
            if(frontIsClear()) {
                move();
                if(frontIsBlocked()){
                    putBeepers();
                }
            }

        }
    }

    private void pickAndPutSecond() throws Exception {
        while (frontIsClear()) {
            pickBeepers();
            move();
            pickBeepers();
            putBeepers();
            if(frontIsClear()) {
                move();

            }
        }
    }


    private void pickBeepers() throws Exception {
        if(beepersPresent()){
            while (beepersPresent())
                pickBeeper();
        }
    }

    private void putBeepers() throws Exception {
        if(noBeepersPresent()) {
            for (int i = 0; i < 4; i++) {
                putBeeper();
            }
        }
    }



    private void changeTheRaw() throws Exception {
        turnRight();
        if (frontIsClear()) {
            move();
            turnRight();
        }
    }

    private void turnRight() throws Exception {
        for(int i=0; i<3; i++){
            turnLeft();
        }
    }

}

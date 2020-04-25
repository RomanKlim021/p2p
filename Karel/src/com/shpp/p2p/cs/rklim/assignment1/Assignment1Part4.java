package com.shpp.p2p.cs.rklim.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part4 extends KarelTheRobot {

    // Prerequisites: Karel stands in the Northeast corner and looks to the West
    // Result: Karel creates a chessboard
    public void run() throws Exception {
        createMap();
    }

    // Prerequisites: Karel stands in the Southeast corner and looks West
    // Result: Karel walks in rows, collects extra beeps and puts them where needed
    public void createMap() throws Exception {
        if(frontIsBlocked()){
            turnLeft();
            pickAndPutFirst();
        }
        while (frontIsClear()) {
            pickAndPutFirst();
            goNextRaw();
            pickAndPutSecond();
            goNextRaw();
            }
        }

    // Karel looks East and moves to the wall
        private void goToFirst() throws Exception {
        while (frontIsClear()){
            move();
        }
    }

    // Karel turn around
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    // Prerequisites: Karel stands on the West Line and looks East
    // Result: Karel collects and puts beepers on odd rows
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

    // Prerequisites: Karel stands on the West Line and looks East
    // Result: Karel collects and puts beepers on even rows
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

    // Karel collects beepers, if it is
    private void pickBeepers() throws Exception {
        if(beepersPresent()){
            while (beepersPresent())
                pickBeeper();
        }
    }

    // Karel puts 4 beepers
    private void putBeepers() throws Exception {
        if(noBeepersPresent()) {
                putBeeper();
        }
    }



    // Karel goes up one line
    private void changeTheRaw() throws Exception {
        turnRight();
        if (frontIsClear()) {
            move();
            turnRight();
        }
    }

    // Background: Karel stands in the Eastern Column
    // Result: Karel rises one line higher
    private void goNextRaw() throws Exception {
        turnAround();
        goToFirst();
        changeTheRaw();
    }


    // Karel turns right
    private void turnRight() throws Exception {
        for(int i=0; i<3; i++){
            turnLeft();
        }
    }

}

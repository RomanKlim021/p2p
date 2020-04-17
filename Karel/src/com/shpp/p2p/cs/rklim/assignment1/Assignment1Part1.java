package com.shpp.p2p.cs.rklim.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot {

    //all karel road
    public void run() throws Exception {
        goToBeeper();
        pickBeeper();
        goToStartPos();
    }

    //go to the start after pick beeper
    private void goToStartPos() throws Exception {

        turnAround();
        moveWhileFrontIsClear();
        turnRight();
        move();
    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    //go to the beeper
    private void goToBeeper() throws Exception {

        turnRight();
        move();
        turnLeft();
        moveWhileFindBeeper();
    }

    //move while no beeper
    private void moveWhileFindBeeper() throws Exception {
        while (noBeepersPresent()) {
            move();
        }
    }

    //move while no wall
    private void moveWhileFrontIsClear() throws Exception {

        while (frontIsClear()) {
            move();
        }
    }

    //turn right
    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}

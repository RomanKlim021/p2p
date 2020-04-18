package com.shpp.p2p.cs.rklim.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot {

    // Prerequisites: Karel stands in the house
    // Result: Karel left home, picked up a newspaper, and returned to the starting position
    public void run() throws Exception {
        goToBeeper();
        pickBeeper();
        goToStartPos();
    }

    // Prerequisites: Karel starts moving from the starting point to the newspaper
    private void goToBeeper() throws Exception {

        turnRight();
        move();
        turnLeft();
        moveWhileFindBeeper();
    }

    // Prerequisites: Karel stands with his back to the house
    // Result: Karel returns and goes to the starting point
    private void goToStartPos() throws Exception {

        turnAround();
        moveWhileFrontIsClear();
        turnRight();
        move();
    }

    // Karel is deployed
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }


    // Karel moves until he finds the newspaper
    private void moveWhileFindBeeper() throws Exception {
        while (noBeepersPresent()) {
            move();
        }
    }

    // Karel moves until he hits a wall
    private void moveWhileFrontIsClear() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }

    // Karel turns right
    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}

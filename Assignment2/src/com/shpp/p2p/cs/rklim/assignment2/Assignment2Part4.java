package com.shpp.p2p.cs.rklim.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 460;
    public static final int APPLICATION_HEIGHT = 360;
    private static final double RECT_WIDTH = 100;
    private static final double RECT_HEIGHT = 200;

    public void run(){
        int x = 0;
        int y = 0;
        add(drawRect(Color.blue, x, y, RECT_WIDTH, RECT_HEIGHT));
        add(drawRect(Color.white, x + 100, y, RECT_WIDTH, RECT_HEIGHT));
        add(drawRect(Color.red, x + 200, y, RECT_WIDTH, RECT_HEIGHT));
    }

    private void drawFlag(double x, double y) {

    }


    private GRect drawRect(Color color, double x, double y, double rectWith, double rectHeight) {
        GRect rect = new GRect(x, y, rectWith, rectHeight);
        rect.setFillColor(color);
        rect.setFilled(true);
        return rect;
    }
}

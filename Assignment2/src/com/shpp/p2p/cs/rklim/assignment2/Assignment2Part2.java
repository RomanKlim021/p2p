package com.shpp.p2p.cs.rklim.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    private static final int RECT_WIDTH=200;


    public void run() {
        int x=0;
        int y=0;
        int radius = 50;
        double diameter = radius*2;
        double rectWidth = getWidth()-diameter;
        double rectHeight = getHeight()-diameter;
        add(drawCircle(x, y, diameter));
        add(drawCircle(getWidth()-diameter, y, diameter));
        add(drawCircle(x, getHeight()-diameter, diameter));
        add(drawCircle(getWidth()-diameter, getHeight()-diameter, diameter));
        add(drawRect(radius, radius, rectWidth, rectHeight));
    }

    private GOval drawCircle(double x, double y, double radius) {
        GOval circle = new GOval(x, y, radius, radius);
        fillCircle(circle, Color.black);
        return circle;
    }

    private void fillCircle(GFillable circle, Color color) {
        circle.setFillColor(color);
        circle.setFilled(true);
    }

    private GRect drawRect (double x, double y, double rektWidth, double rektHeight){
        GRect rect = new GRect(x, y, rektWidth, rektHeight);
        rect.setFilled(true);
        rect.setColor(Color.WHITE);
        return rect;
    }
}


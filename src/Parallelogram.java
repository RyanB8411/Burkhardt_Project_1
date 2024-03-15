// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.Color;
import java.awt.Point;

// Class that defines a hollow rectangle object

class Parallelogram extends HollowPolygon {

    // Constructor that initializes the vertices of the rectangle

    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int xOffset) {
        super(color, 4);
        int[] x_points = {upperLeft.x, upperLeft.x + xOffset, lowerRight.x, upperLeft.x - xOffset};
        int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y};
        createPolygon(x_points, y_points);
    }
}
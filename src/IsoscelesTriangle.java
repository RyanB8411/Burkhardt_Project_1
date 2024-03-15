// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.Color;
import java.awt.Point;

// Class that defines a hollow rectangle object

class IsoscelesTriangle extends SolidPolygon {

    // Constructor that initializes the vertices of the rectangle

    public IsoscelesTriangle(Color color, Point topCenter, int height, int width) {
        super(color, 3);
        int[] x_points = {topCenter.x, topCenter.x + (width/2), topCenter.x - (width/2)};
        int[] y_points = {topCenter.y, topCenter.y + height, topCenter.y + height};
        createPolygon(x_points, y_points);
    }
}
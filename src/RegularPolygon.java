// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.Color;
import java.awt.Point;

// Class that defines a hollow rectangle object

class RegularPolygon extends SolidPolygon {

    // Constructor that initializes the vertices of the rectangle

    public RegularPolygon(Color color, int numSides, Point centerPoint, int radius) {
        super(color, 4);
        int[] x_points = new int[numSides];
        int[] y_points = new int[numSides];
        for (int i=0; i<numSides; ++i) {
            double temp_x = (centerPoint.x + radius) * Math.cos(2*Math.PI*i/numSides);
            double temp_y = (centerPoint.x + radius) * Math.sin(2*Math.PI*i/numSides);
            x_points[i] = (int)temp_x;
            y_points[i] = (int)temp_y;
        }
        createPolygon(x_points, y_points);
    }
}
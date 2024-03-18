/**
 * UMGC CMSC 330
 * Project 1
 * This class extends SolidPolygon uses the same methods from the rectangle class but
 * adds a point and an offset to the constructor instead of the height and width.
 * I chose to use the offset to shift the top to the right and left for the bottom points.
 * @author Ryan Burkhardt
 * Date: 17Mar2024
 * Java 21
*/

import java.awt.Color;
import java.awt.Point;

// Class that defines a hollow rectangle object

class Parallelogram extends SolidPolygon {

    // Constructor that initializes the vertices of the parallelogram

    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int xOffset) {
        super(color, 4);//Super color with set vertices
        int[] x_points = {upperLeft.x, lowerRight.x + xOffset, lowerRight.x, upperLeft.x - xOffset};//Uses the offset to shift x levels
        int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y};//Uses the lowerRight and upperLeft y values, these have no shifts
        createPolygon(x_points, y_points);//Send the list to create the polygon
    }
}
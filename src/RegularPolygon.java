/**
 * UMGC CMSC 330
 * Project 1
 * Class that extends solid polygon that will call Super color and sets the verteices by how many sides
 * are inputted from the .txt file. This class creates a polygon based off a radius, number of sides, the
 * center point and a color. This class is however different where vertices can change and the set of x
 * and y coordinates run through a for loop and run through the same calculation incrementing the angle
 * put into cos for x values and sin for y values.
 * @author Ryan Burkhardt
 * Date: 17Mar2024
 * Java 21
*/

import java.awt.Color;
import java.awt.Point;

// Class that defines a hollow rectangle object

class RegularPolygon extends SolidPolygon {//Extend Solid Polygon

    // Constructor that initializes the vertices of the Polygon

    public RegularPolygon(Color color, int numSides, Point centerPoint, int radius) {
        super(color, numSides);//Set Color and number of vertices based off inputted parameters instead of set vertex
        int[] x_points = new int[numSides];//Create a new empty list to store x values
        int[] y_points = new int[numSides];//Create a new empty list to store y values
        for (int i=0; i<numSides; ++i) {//Run a for loop for the number of sides
            double temp_x = centerPoint.x + radius * Math.cos(2*Math.PI*i/numSides);//Calculate the x_coordinate value using cos
            double temp_y = centerPoint.y + radius * Math.sin(2*Math.PI*i/numSides);//Calculate the y_coordinate value using sin
            x_points[i] = (int)temp_x;//Convert indexed x value Double to int and store it in the x_points array
            y_points[i] = (int)temp_y;//Convert indexed y value Double to int and store it in the y_points array
        }
        createPolygon(x_points, y_points);//Lastly create the polygon using our lists
    }
}
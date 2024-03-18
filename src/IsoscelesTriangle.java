/**
 * UMGC CMSC 330
 * Project 1
 * Class that extends solid polygon that will call Super colorand set the vertex couont to 3. It takes a Point
 * at the top center and goes down the height of y as well as half to the left and half to the right to complete
 * the points. Finally it calls the createPolygon to draw the polygon on the screen and displays a solid isosceles triangle
 * @author Ryan Burkhardt
 * Date: 17Mar2024
 * Java 21
*/

//Uses Color and Point in our Constructor
import java.awt.Color;
import java.awt.Point;

class IsoscelesTriangle extends SolidPolygon {

    // Constructor that initializes the vertices of the Isosceles Triangle by using the
    //same method from the rectangle just using different calculations in the x and y values
    //but same input constructors.

    public IsoscelesTriangle(Color color, Point topCenter, int height, int width) {
        super(color, 3);//Calls super color and sets vertices limit
        int[] x_points = {topCenter.x, topCenter.x + (width/2), topCenter.x - (width/2)};//clalculate x values and store in list
        int[] y_points = {topCenter.y, topCenter.y + height, topCenter.y + height};//calculate y values and store in list
        createPolygon(x_points, y_points);
    }
}
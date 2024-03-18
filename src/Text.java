/**
 * UMGC CMSC 330
 * Project 1
 * Class that extends image and Constructs a text object with the super
 * Color Point and a string. After this is made using a method similar to the class
 * uses the override to draw the graphic onto the GUI as per reuirements.
 * @author Ryan Burkhardt
 * Date: 17Mar2024
 * Java 21
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Class that defines 

public class Text extends Image {

    //Stating our private variables that will be used in constructor
    private String string;
    private Point point;

    // Constructor that initializes the Text Object

    Text(Color color, Point point, String string) {
        super(color);//Calls super color to set color
        this.point = point;//Sets the Point Coordinates
        this.string = string;//sets the String
    }

    @Override//Overrides the draw method in Image
    void draw(Graphics graphics) {
        colorDrawing(graphics);//Sets Color of the graphic or string
        graphics.drawString(string, point.x, point.y);//uses the drawString method to display on the GUI
    }
}
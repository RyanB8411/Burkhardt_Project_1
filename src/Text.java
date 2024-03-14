// The Text class must contain a constructor that is supplied the color that defines the text color, a
// point that specifies the text location and a string containing the text to be displayed. It must also
// contain a draw function because it is extends the abstract class Image. The draw function must
// draw the text using the method drawString in Graphics class.

//Ryan Burkhardt
// CMSC 330 Advanced Programming Languages
// Project 1 Draw Text
// Professor: Dr. Elizes
// March 2024

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Class that defines a hollow rectangle object

public class Text extends Image {

    private String string;
    private Point point;

    // Constructor that initializes the vertices of the rectangle

    Text(Color color, Point point, String string) {
        super(color);
        this.point = point;
        this.string = string;
    }

    @Override
    void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(string, point.x, point.y);
    }
    
}

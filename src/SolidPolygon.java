/**
 * UMGC CMSC 330
 * Project 1
 * Class that extends Polgon_. This class is a mirror image of hollow polygon
 * but adds the fill method to actually fill the image on the gui.
 * Constructs the Object in an identical manner with super color and vertex count.
 * @author Ryan Burkhardt
 * Date: 17Mar2024
 * Java 21
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SolidPolygon extends Polygon_ {

    //Copy and pasted Hollow Polygon Code and just changed the drawPolygon
    //to add fill instead of just tracing the polygons outline.
    public SolidPolygon(Color color, int vertexCount) {//Takes in Super color and number of vertices to create a Solid Polygon Object
        super(color, vertexCount);
    }

    // Draws Solid polygon

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);//Draw the outline of the polygon
        graphics.fillPolygon(polygon);//***Added*** Fills the inside of the polygon
    }
    
}

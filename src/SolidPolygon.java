import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SolidPolygon extends Polygon_ {

    //Used HollowPolygon as an example for this
    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    // Draws Solid polygon

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);//Draw the outline of the polygon
        graphics.fillPolygon(polygon);//Fill the inside of the polygon
    }
    
}

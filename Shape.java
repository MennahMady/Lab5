import java.awt.*;

/**
 * Shape.java
 * 
 * @author Rob Nash
 * 
 *         This class is the superclass in our shape inheritance hierarchy. All
 *         methods
 *         that are common to shapes should go here. For example, all shapes in
 *         Java2D
 *         have coordinates (x, y) for their position, so we included x and y
 *         here.
 *         Many shapes also have a width and a height, but not all do, so we
 *         didn't
 *         include width and height here.
 * 
 *         Note that this class is mostly empty. Since there is no algorithm
 *         generic enough
 *         to guess an arbitrary shape's area, subclasses will have to override
 *         getArea().
 *         In the same way, the draw(Graphics g) method is empty, since we don't
 *         know what
 *         shape we are going to draw. Subclasses will have to override the
 *         draw() method.
 */
public class Shape extends Object {
    private int x = 0;
    private int y = 0;

    public Shape(int a, int b) {
        x = a;
        y = b;
    }

    public double getArea() {
        return -1;
    }

    public void draw(Graphics g) {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

import java.awt.*;
public class Circle extends Shape {
    private int radius;
  
    public Circle(int x, int y, int r) {
      super(x, y);
      radius = r;
    }
  
    public int getRadius() {
      return radius;
    }
  
    public void setRadius(int r) {
      radius = r;
    }
  
    @Override
    public double getArea() {
      return Math.PI * radius * radius;
    }
  
    @Override
    public void draw(Graphics g) {
      g.drawOval(getX() - radius, getY() - radius, 2 * radius, 2 * radius);
    }
  }
  
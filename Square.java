import java.awt.*;
public class Square extends Shape {
    private int sideLength;
  
    public Square(int x, int y, int sideLength) {
      super(x, y);
      this.sideLength = sideLength;
    }
  
    public int getSideLength() {
      return sideLength;
    }
  
    public void setSideLength(int sideLength) {
      this.sideLength = sideLength;
    }
  
    @Override
    public double getArea() {
      return sideLength * sideLength;
    }
  
    @Override
    public void draw(Graphics g) {
      g.drawRect(getX(), getY(), sideLength, sideLength);
    }
  }
  
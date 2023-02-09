public class ColorWithAlpha extends SimpleColor {
    private int alpha;

    // Constructor with only an alpha value
    public ColorWithAlpha(int alpha) {
        super(0, 0, 0);
        setAlpha(alpha);
    }

    // Overloaded constructor that takes 4 values (RGBA)
    public ColorWithAlpha(int r, int g, int b, int alpha) {
        super(r, g, b);
        setAlpha(alpha);
    }

    // Overloaded copy constructor that takes an existing ColorWithAlpha object
    public ColorWithAlpha(ColorWithAlpha colorWithAlpha) {
        super(colorWithAlpha);
        setAlpha(colorWithAlpha.getAlpha());
    }

    // Getter for alpha
    public int getAlpha() {
        return alpha;
    }

    // Setter for alpha, throws a ColorException if the value is outside [0, 255]
    public void setAlpha(int alpha) {
        if (alpha < 0 || alpha > 255) {
            throw new ColorException("Invalid alpha value, should be between 0 and 255 inclusive");
        }
        this.alpha = alpha;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return super.toString() + ", alpha: " + alpha;
    }

    // Overridden equals method
    @Override
    public boolean equals(Object o) {
        if (o instanceof ColorWithAlpha) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            ColorWithAlpha that = (ColorWithAlpha) o;
            return alpha == that.alpha;
        }
        return false;
    }
}

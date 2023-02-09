/**
 * TODO: Modify this class to enforce the class invariants (the [0-255] rule).
 */
public class SimpleColor {
    private int r;
    private int g;
    private int b;

    public SimpleColor() {
    }

    public SimpleColor(int r, int g, int b) {
        setR(r);
        setG(g);
        setB(b);
    }

    public SimpleColor(SimpleColor b) {
        this(b.r, b.g, b.b);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r >= 0 && r <= 255)
            this.r = r;
        else
            throw new IllegalArgumentException(
                    "Invalid value for Red component: " + r + ". Value must be between 0 and 255.");
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        if (g >= 0 && g <= 255)
            this.g = g;
        else
            throw new IllegalArgumentException(
                    "Invalid value for Green component: " + g + ". Value must be between 0 and 255.");
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b >= 0 && b <= 255)
            this.b = b;
        else
            throw new IllegalArgumentException(
                    "Invalid value for Blue component: " + b + ". Value must be between 0 and 255.");
    }

    public void setColor(int a, int b, int c) {
        setR(a);
        setG(b);
        setB(c);
    }

    @Override
    public String toString() {
        return "(" + r + "," + g + "," + b + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleColor other = (SimpleColor) obj;
        if (b != other.b)
            return false;
        if (g != other.g)
            return false;
        if (r != other.r)
            return false;
        return true;
    }
}
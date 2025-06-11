
// Tetromino.java
import java.awt.*;

public enum Tetromino {
    I(new Point[][] {
        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1)},
        {new Point(2, 0), new Point(2, 1), new Point(2, 2), new Point(2, 3)},
        {new Point(0, 2), new Point(1, 2), new Point(2, 2), new Point(3, 2)},
        {new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3)}
    }, Color.CYAN),

    O(new Point[][] {
        {new Point(1, 0), new Point(2, 0), new Point(1, 1), new Point(2, 1)},
        {new Point(1, 0), new Point(2, 0), new Point(1, 1), new Point(2, 1)},
        {new Point(1, 0), new Point(2, 0), new Point(1, 1), new Point(2, 1)},
        {new Point(1, 0), new Point(2, 0), new Point(1, 1), new Point(2, 1)}
    }, Color.YELLOW),

    T(new Point[][] {
        {new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(2, 1)},
        {new Point(1, 0), new Point(1, 1), new Point(2, 1), new Point(1, 2)},
        {new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(1, 2)},
        {new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2)}
    }, Color.MAGENTA);

    private final Point[][] shapes;
    private final Color color;

    Tetromino(Point[][] shapes, Color color) {
        this.shapes = shapes;
        this.color = color;
    }

    public Point[] getShape(int rotation) {
        return shapes[rotation];
    }

    public Color getColor() {
        return color;
    }
}

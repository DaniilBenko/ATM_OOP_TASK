package task2.triangle;

import java.util.Objects;
import static java.lang.Math.*;

public class Point {

    private final int x;
    private final int y;

    public Point (final int x, final int y){
        this.x = x;
        this.y = y;
    }

    public double distanceTo(final Point point) {
        return sqrt(pow(abs(this.x - point.x), 2) + pow(abs(this.y - point.y), 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}

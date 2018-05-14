package task2.triangle;

import task2.triangle.Point;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

import static java.lang.Math.*;

public class Triangle {
    protected final double ab;
    protected final double bc;
    protected final double ca;

    public Triangle(final Point first, final Point second, final Point third) {
        this.ab = first.distanceTo(second);
        this.bc = second.distanceTo(third);
        this.ca = third.distanceTo(first);
    }

    /*public boolean exists() {
        return (this.ab < this.bc + this.ca) &&
                (this.bc < this.ab + this.ca) &&
                (this.ca < this.ab + this.bc);
    }

    public double perimeter(){
        if (this.exists()) {
            return ((this.ab + this.bc + this.ca));
        } else {
            throw new IllegalStateException("Triangle does not exists");
        }
    }

    public double area() {
        if (this.exists()) {
            double p = perimeter();
            return sqrt(p/2 * (p/2 - this.ab) * (p/2 - this.bc) * (p/2 - this.ca));
        } else {
            throw new IllegalStateException("Triangle does not exists");
        }
    }

    public boolean isIsosceles(){
        boolean result = false;
        if (this.exists()) {
            result = this.ab == this.bc || this.ca == this.bc || this.ab == this.ca;
        }
        return result;
    }

    public boolean isEquilateral(){
        boolean result = false;
        if (this.exists()) {
            result = this.ab == this.bc && this.bc == this.ca;
        }
        return result;
    }

    private double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public boolean isRight(){
        boolean result = false;
        if (this.exists()) {
            result = (this.round(pow(ab, 2)) == this.round(pow(ca, 2) + pow(bc, 2))) ||
                    (this.round(pow(ca, 2)) == this.round(pow(ab, 2) + pow(bc, 2))) ||
                    (this.round(pow(bc, 2)) == this.round(pow(ab, 2) + pow(ca, 2)));
        }
        return result;
    }*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.ab, ab) == 0 &&
                Double.compare(triangle.bc, bc) == 0 &&
                Double.compare(triangle.ca, ca) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(ab, bc, ca);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "ab=" + ab +
                ", bc=" + bc +
                ", ca=" + ca +
                '}';
    }
}

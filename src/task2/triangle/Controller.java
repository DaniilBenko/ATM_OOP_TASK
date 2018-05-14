package task2.triangle;
import task2.triangle.Triangle;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Controller {
    Triangle kek = new Triangle (new Point(0, 0), new Point(0, 1), new Point(1, 0));
    public void start(){
        System.out.println("Area = " + area());
        System.out.println("Perimeter = "+ perimeter());
        System.out.println("Is it Isosceles Triangle? -" + isIsosceles());
        System.out.println("Is it Equilateral Triangle? -" + isEquilateral());
        System.out.println("Is it Right Triangle? -" + isRight());
    }

    public boolean exists() {
        return (kek.ab < kek.bc + kek.ca) &&
                (kek.bc < kek.ab + kek.ca) &&
                (kek.ca < kek.ab + kek.bc);
    }
    public double perimeter(){
        if (this.exists()) {
            return ((kek.ab + kek.bc + kek.ca));
        } else {
            throw new IllegalStateException("Triangle does not exists");
        }
    }

    public double area() {
        if (this.exists()) {
            double p = perimeter();
            return sqrt(p/2 * (p/2 - kek.ab) * (p/2 - kek.bc) * (p/2 - kek.ca));
        } else {
            throw new IllegalStateException("Triangle does not exists");
        }
    }

    public boolean isIsosceles(){
        boolean result = false;
        if (this.exists()) {
            result = kek.ab == kek.bc || kek.ca == kek.bc || kek.ab == kek.ca;
        }
        return result;
    }

    public boolean isEquilateral(){
        boolean result = false;
        if (this.exists()) {
            result = kek.ab == kek.bc && kek.bc == kek.ca;
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
        if (exists()) {
            result = (round(pow(kek.ab, 2)) == round(pow(kek.ca, 2) + pow(kek.bc, 2))) ||
                    (round(pow(kek.ca, 2)) == round(pow(kek.ab, 2) + pow(kek.bc, 2))) ||
                    (round(pow(kek.bc, 2)) == round(pow(kek.ab, 2) + pow(kek.ca, 2)));
        }
        return result;
    }

}

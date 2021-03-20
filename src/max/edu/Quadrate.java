package max.edu;

import java.util.Objects;

public class Quadrate {
    private int said;

    public Quadrate() {
    }

    public Quadrate(int said) {
        this.said = said;
    }

    public int getSaid() {
        return said;
    }

    public void setSaid(int said) {
        this.said = said;
    }

    @Override
    public String toString() {
        return "Quadrate{" +
                "said=" + said +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrate quadrate = (Quadrate) o;
        return said == quadrate.said;
    }

    @Override
    public int hashCode() {
        return Objects.hash(said);
    }

    public double getPerimeter(){
        int perimeter = this.getSaid() * 4;
        return perimeter;
    }

    public double getArea(){
        int area = this.getSaid() * getSaid();
        return area;
    }
}

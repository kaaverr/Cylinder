package max.edu;

public class Main {

    public static void main(String[] args) {
        Quadrate q1 = new Quadrate(6);
        System.out.println(q1.toString());
        System.out.println("площа = " + q1.getArea());
        System.out.println("периметрер = " + q1.getPerimeter());
    }
}

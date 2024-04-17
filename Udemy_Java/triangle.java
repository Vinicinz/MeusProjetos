package Udemy_Java;

public class triangle {

    public double a;
    public double b;
    public double c;

    public Double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

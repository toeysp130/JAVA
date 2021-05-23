public class Triangle{
    private double height;
    private double base;
    public Triangle (double h, double b) {
        this.base = b;
        this.height = h;
    }
    public void setHeight(double x) {
        this.height = x;
    }
    public double getHeight() {
        return this.height;
    }
    public void setBase(double x) {
        this.base = x;
    }
    public double getBase() {
        return this.base;
    }
    public double getArea() {
        return 0.5*base*height;
    }
    public String toString() {
        return " Triangle: Height" + height + " Base = " + base
               + " Area = " + getArea();
    }
}
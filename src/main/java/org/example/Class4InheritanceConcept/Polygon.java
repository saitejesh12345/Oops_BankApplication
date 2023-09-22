package org.example.Class4InheritanceConcept;

public class Polygon {

    protected int height;
    protected  int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec.setHeight(12);
        rec.setWidth(13);

        tri.setHeight(12);
        tri.setWidth(13);

        System.out.println("Area of Rectangle:" + rec.area());
        System.out.println("Area of triangle:" + tri.area());

    }
}

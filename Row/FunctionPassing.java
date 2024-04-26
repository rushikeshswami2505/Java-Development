package Row;

abstract class Shape {
    String shapeName;

    Shape() {
    }

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract float getArea();
}

class Rectangle extends Shape {
    float width;
    float height;

    Rectangle() {
    }

    Rectangle(String shapeName, float width, float height) {
        super(shapeName);
        this.width = width;
        this.height = height;
    }

    public void setWidht(float widht) {
        this.width = widht;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea() {
        return height * width;
    }

}

public class FunctionPassing {
    public static void main(String[] args) {
        Rectangle rectangleDemo1 = new Rectangle("Upper rectangle", 30.4f, 23.4f);
        System.out.println("Shape Name: " + rectangleDemo1.getShapeName() + " Area: " + rectangleDemo1.getArea());

        Rectangle rectangleDemo2 = new Rectangle();
        rectangleDemo2.setShapeName("Lower");
        rectangleDemo2.setHeight(44.3f);
        rectangleDemo2.setWidht(23.5f);
        System.out.println("Shape Name: " + rectangleDemo2.getShapeName() + " Area: " + rectangleDemo2.getArea());
    }
}

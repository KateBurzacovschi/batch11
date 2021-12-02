package Project2;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
    int a=10;
    int r=5;
}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Area of circle is :"+3.14*25);
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of circle is : "+2*3.14*5);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Area of square is :"+r*r);
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("Perimetr of square is :"+10*4);
    }
}
class TesterSt{
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.calculateArea();
        shape.calculatePerimeter();

        Shape shape1=new Square();
        shape1.calculateArea();
        shape1.calculatePerimeter();
    }
}
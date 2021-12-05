package Project2;

public interface Shape {
    void calculateArea(double a);
    void calculatePerimeter(double a );

}
class Circle implements Shape{
    @Override
    public void calculateArea(double radius) {
        System.out.println("Area of circle is :"+(Math.PI*Math.pow(radius,2)));
    }
    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("Perimeter of circle is : "+2*Math.PI*radius);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea(double r) {
        System.out.println("Area of square is :"+r*r);
    }
    @Override
    public void calculatePerimeter(double length) {
        System.out.println("Perimetr of square is :"+(4*length));
    }
}
class TesterSt{
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.calculateArea(5);
        circle.calculatePerimeter(5);

        Shape square=new Square();
      square.calculateArea(10);
       square.calculatePerimeter(10);
    }
}
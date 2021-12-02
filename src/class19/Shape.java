package class19;

public class Shape {
    int radius;

    public Shape(int radius) {
        this.radius = radius;
    }
}
    class Circle extends Shape {
    Circle(int radius) {
            super(radius);
        }

        void calulate() {
            double Area = 3.14 * radius * radius;
            System.out.println("The circle area is: " + Area);
        }

        public static void main(String[] args) {
            Circle ci=new Circle(10);
            ci.calulate();
        }


    }




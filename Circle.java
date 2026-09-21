public class Circle {
    double radius;
    void CalculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
    void CalculateCircumference(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle = " + circumference);
    }
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.radius = 5;
        c.CalculateArea();
        c.CalculateCircumference();
    }

}

public class Triangle extends Shape
{
    private double a, b, c;

    public Triangle(String n, double a, double b, double c)
    {
        super(n);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area()
    {
        double s = semiperimeter();
        return Math.sqrt(s* (s - a) * (s - b) * (s - c));
    }

    public double perimeter()
    {
        return a + b + c;
    }

    public boolean isIsosceles()
    {
        return isValidTriangle() && (a == b || b == c || a == c);

    }

    public boolean isRightTriangle()
    {
        return isValidTriangle() && (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
    }

    public boolean isValidTriangle()
    {
        if (a < 0 || b < 0 || c < 0)
        {
            return false;
        }

        else
            return true;
    }
}

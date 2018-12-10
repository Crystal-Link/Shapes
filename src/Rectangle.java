public class Rectangle extends Quadrilateral
{
    public Rectangle(String n, double len, double width)
    {
        super(n, len, width, len, width);
    }

    public double area()
    {
        return getSide1() * getSide2();
    }
}

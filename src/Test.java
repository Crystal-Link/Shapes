import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        Shape myCircle = new Circle("My circle", 5);
        System.out.println(myCircle);

        Shape myTriangle = new Triangle("right", 3, 4, 5);
        System.out.println(myTriangle);

        Shape myRectangle = new Rectangle("My rectangle", 10, 5);
        System.out.println(myRectangle);

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(myCircle);
        shapes.add(myRectangle);
        shapes.add(myTriangle);

        Shape.sortByAreaPerimeter(shapes);
        for (Shape s : shapes)
        {
            System.out.println(s);
        }
        System.out.println();
    }
}

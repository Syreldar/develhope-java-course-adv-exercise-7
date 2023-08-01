public class Shape
{
    private final String shapeName;
    private int numberOfEdges;

    public Shape()
    {
        this.shapeName = "Undefined shape";
        System.out.printf("Creating a %s...%n", shapeName);
    }

    public Shape(double radius)
    {
        this.shapeName = "Circle";
        this.numberOfEdges = Integer.MAX_VALUE; // A Circle is supposed to have unlimited edges
        System.out.printf("Creating a %s with radius %.2f...%n", shapeName, radius);
    }

    public Shape(int edges, double edgeLength)
    {
        this.shapeName = "Square";
        this.numberOfEdges = edges;
        System.out.printf("Creating a %s with edges %d and edge length %.2f...%n", shapeName, numberOfEdges, edgeLength);
    }

    public Shape(int edges, double length, double width)
    {
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
        System.out.printf("Creating a %s with edges %d, length %.2f and width %.2f...%n", shapeName, numberOfEdges, length, width);
    }

    public Shape(int edges, double edge1, double edge2, double edge3)
    {
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
        System.out.printf("Creating a %s with edges %d and edge lengths %.2f, %.2f, %.2f...%n", shapeName, numberOfEdges, edge1, edge2, edge3);
    }

    public String getShapeDetails()
    {
        return String.format("Shape name: %s, Number of edges: %d", shapeName, numberOfEdges);
    }
}

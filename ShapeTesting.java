public class ShapeTesting
{
    public static void main(String[] args)
    {
        Shape shapeDefault = new Shape();
        Shape shapeCircle = new Shape(5.0);
        Shape shapeSquare = new Shape(4, 5.0);
        Shape shapeRectangle = new Shape(4, 10.0, 5.0);
        Shape shapeTriangle = new Shape(3, 3.0, 4.0, 5.0);

        String detailsDefault = shapeDefault.getShapeDetails();
        String detailsCircle = shapeCircle.getShapeDetails();
        String detailsSquare = shapeSquare.getShapeDetails();
        String detailsRectangle = shapeRectangle.getShapeDetails();
        String detailsTriangle = shapeTriangle.getShapeDetails();

        System.out.println(detailsDefault);
        System.out.println(detailsCircle);
        System.out.println(detailsSquare);
        System.out.println(detailsRectangle);
        System.out.println(detailsTriangle);
    }
}

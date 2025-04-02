public class ShapeTransformation {
    public static void main(String[] agrs) {
        // Define the initial shapeValue (double)
        double shapeValue = 42.75;

        // Display initial shape
        System.out.println("Current Shape (double) : " + shapeValue);

        // Transform into different shapes
        System.out.println("Transforming shapes...");

        // Convert to int (decimal part is truncated)
        int intShape = (int) shapeValue;
        System.out.println("Transforming shape value to int : " + intShape);

        // Convert to long (similar truncation occurs)
        long longShape = (long) shapeValue;
        System.out.println("Transforming shape value to long : " + longShape);

        // Convert to float (preserves decimal precision but may introduce rounding errors)
        float floatShape = (float) shapeValue;
        System.out.println("Transforming shape value to float : " + floatShape);
    }
}

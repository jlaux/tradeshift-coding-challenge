import java.util.*;

enum Type
{
    EQUILATERAL, ISOSCELES, SCALENE;
}

public class Triangle extends Polygon {

    private Type type;

    public Triangle(double[] edges) {
        super(edges);
        if (numSides != 3) {
            throw new IllegalArgumentException("Not a valid triangle");
        }
        determineType(edges);

    }
    public Type getTriangleType() {
        return this.type;
    }

    private void determineType(double[] edges) {
        Hashtable<String, Integer> uniqueSides = new Hashtable<String, Integer>();
        for (double i: edges) {
            String keyName = String.valueOf(i);
            if (uniqueSides.containsKey(keyName)) {
                int numTimes = uniqueSides.get(keyName);
                uniqueSides.put(keyName, numTimes+1);
            } else {
                uniqueSides.put(keyName, 1);
            }
        }
        for (String key: uniqueSides.keySet()) {
            int occurrence = uniqueSides.get(key);
            if (occurrence == 3) {
                type = Type.EQUILATERAL;
            } else if (occurrence == 2) {
                type = Type.ISOSCELES;
            }
        }
        if (type == null) {
            type = Type.SCALENE;
        }
    }


}
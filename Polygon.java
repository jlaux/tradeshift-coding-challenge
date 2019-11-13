abstract class Polygon {

    public int numSides;
    public double[] sides;


    public Polygon(double[] edges) {
        if (edges.length < 3) {
            throw new IllegalArgumentException("Not enough sides for a polygon");
        }
        double perimeter = getPerimeter(edges);
        if (ifIllegalPolygon(edges, perimeter)) {
            throw new IllegalArgumentException("Not a valid polygon");
        }
        sides = edges;
        numSides = edges.length;
    }

    private double getPerimeter(double[] edges) {
        double perimeter = 0;
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] <= 0) {
                throw new IllegalArgumentException("Side has non-positive length");
            }
            perimeter += edges[i];
        }
        return perimeter;
    }

    private boolean ifIllegalPolygon(double[] edges, double perimeter) {
        for (int j = 0; j < edges.length; j++) {
            double sumOtherSides = perimeter - edges[j];
            if (edges[j] >= sumOtherSides) {
                return true;
            }
        }
        return false;
    }
}

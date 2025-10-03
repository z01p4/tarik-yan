public class JarakTerdekat {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 3},
                {-1, -1},
                {1, 1},
                {2, 0.5},
                {2, -1},
                {3, 3},
                {4, 2},
                {4, -0.5}
        };

        int points1 = 0;
        int points2 = 1;
        double minDistance = distance(points[0][0], points[0][1], points[1][0], points[1][1]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                double dist = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (dist < minDistance) {
                    minDistance = dist;
                    points1 = i;
                    points2 = j;
                }
            }
        }

        System.out.print("Titik terdekat adalah (" + points[points1][0] + ", " + points[points1][1] + ") dan " +
                "(" + points[points2][0] + ", " + points[points2][1] + ")");
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}

public class SquaresPosition {
    public static String getPosition(int x1, int y1, int s1, int x2, int y2, int s2) {

        // Atribut x1
        int x1Maks = x1 + s1;
        int x1Min = x1;

        // Atribut y1
        int y1Maks = y1;
        int y1Min = y1 + s1;

        // Atribut x2
        int x2Maks = x2 + s2;
        int x2Min = x2;

        // Atribut y2
        int y2Maks = y2;
        int y2Min = y2 + s2;

        if (x1Maks > x2Maks && x1Min < x2Min && y1Maks > y1Min && y1Min < y2Min) {
            return "Berada di dalam";
        } else if (x1Maks > x2Maks || x1Min < x2Min || y1Maks > y1Min || y1Min < y2Min) {
            return "Beririsan";
        } else {
            return "Berada di luar";
        }
    }
}
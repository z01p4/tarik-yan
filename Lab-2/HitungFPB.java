public class HitungFPB {
    public static int hitungFPB(int x, int y) {
        int pembagi, tdkPembagi;

        if (x >= y) {
            tdkPembagi = x;
            pembagi = y;
        } else {
            tdkPembagi = y;
            pembagi = x;
        }

        if (x % pembagi == 0 && y % pembagi == 0) {
            return pembagi;
        } else {
            for (int i = pembagi; i > 0; i--) {
                if (x % i == 0 && y % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}
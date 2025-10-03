public class JumlahArrayGanjil {
    public static int jumlahArrayGanjil(int[] data) {
        if (data.length <= 0) {
            return 0;
        }

        int total = 0;
        for (int ganjil : data) {
            if (ganjil % 2 != 0) {
                total += ganjil;
            }
        }
        return total;
    }
}

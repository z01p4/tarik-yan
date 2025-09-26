public class JumlahArrayGanjil {
    public static int jumlahArrayGanjil(int[] data) {
        int total = 0;
        for (int i=0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                total += data[i];
            }
        }
        return total;
    }
}

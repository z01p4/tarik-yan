import java.util.Arrays;

public class CreatingArray {
    public static void main(String[] args) {
        String[] mobil;
        mobil = new String[5];
        mobil[0] = "Toyota";
        mobil[1] = "Xenia";
        mobil[2] = "Avanza";
        mobil[3] = "Lexus";
        mobil[4] = "Bugati";

        System.out.print(Arrays.toString(mobil));
    }
}

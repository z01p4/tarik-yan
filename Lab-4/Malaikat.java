import java.util.Arrays;

public class Malaikat {
    public static void main(String[] args) {
        String[] malaikat = new String[10];

        malaikat[0] = "Jibril";
        malaikat[1] = "Mikail";
        malaikat[2] = "Israil";
        malaikat[3] = "Izrail";
        malaikat[4] = "Munkar";
        malaikat[5] = "Nakir";
        malaikat[6] = "Rakib";
        malaikat[7] = "Atit";
        malaikat[8] = "Malik";
        malaikat[9] = "Ridwan";

        for (int i = 0; i < 10; i++) {
            System.out.print("Malaikat ke-" + (i+1) + " adalah malaikat " + malaikat[i]);
            System.out.println();
        }
    }
}

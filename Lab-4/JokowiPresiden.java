import java.util.Arrays;

public class JokowiPresiden {
    public static void main(String[] args) {
        String[] presiden = new String[7];

        System.out.println("Urutan presiden terbaik di Indonesia: ");
        presiden[0] = "Jokowi";
        for (int i = 1; i < 7; i++) {
            presiden[i] = presiden[i-1];
            System.out.println((i) + "." +presiden[i]);
        }


    }
}

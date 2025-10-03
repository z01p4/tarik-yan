import java.lang.reflect.Array;
import java.util.Arrays;

public class AccessignElement {
    public static void main(String[] args) {
        int[] counts = new int[4];

        counts[0] = 7;
        counts[1] = counts[0] + 2;
        counts[2]++;
        counts[2] += 5;
        counts[3]--;

        System.out.print(Arrays.toString(counts));
    }
}

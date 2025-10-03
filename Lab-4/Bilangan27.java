import java.util.Arrays;

public class Bilangan27 {
    public static void main(String[] args) {
        int[] bil3 = new int[5];

        bil3[0] = 3;
        bil3[1] = (int) Math.pow(bil3[0], 2);
        bil3[2] = (int) Math.pow(bil3[1], 2);
        bil3[3] = (int) Math.pow(bil3[2], 2);
        bil3[4] = (int) Math.pow(bil3[3], 2);

        System.out.println(Arrays.toString(bil3));

        int[] bil27 = new int[5];

        bil27[0] = 27;
        for (int i = 1; i < 5; i++) {
            bil27[i] = (int) Math.pow(bil27[i-1], 2);
        }
        System.out.print(Arrays.toString(bil27));
    }
}

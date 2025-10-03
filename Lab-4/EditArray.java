public class EditArray {
    public static String[] editArray(String[] data, int index, String datum) {
        String[] arrayBaru = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            if (i != index) {
                arrayBaru[i] = data[i];
            } else {
                arrayBaru[i] = datum;
            }
        }
        return arrayBaru;
    }
}

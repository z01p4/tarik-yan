public class FamilyYahya {
    public static void main(String[] args) {
        String[] name = new String[5];

        name[0] = "Yahya Basalamah";
        name[1] = "Ayi Sopiah";
        name[2] = "Rayyan Basalamah";
        name[3] = "Rasya Basalamah";
        name[4] = "Rafly Basalamah";

        for (int i = 0; i < 5; i++) {
            System.out.print("Anggota keluarga ke-"+(i+1)+" adalah "+ name[i]);
            System.out.println();
        }
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

public class JumlahArrayGanjilTest {

    @Test
    public void test00() {
        int hasil = JumlahArrayGanjil.jumlahArrayGanjil(new int[]{1, 2, 3, 4, 5});
        assertEquals(9, hasil);
    }

    @Test
    public void test01() {
        assertEquals(0, JumlahArrayGanjil.jumlahArrayGanjil(new int[]{}));
    }

    @Test
    public void test02() {
        assertEquals(0, JumlahArrayGanjil.jumlahArrayGanjil(new int[]{2, 4, 6, 8}));
    }

    @Test
    public void test03() {
        int hasil = JumlahArrayGanjil.jumlahArrayGanjil(new int[]{-5, -4, -3, 0, 1, 2, 3});
        assertEquals(-4, hasil);
    }
}

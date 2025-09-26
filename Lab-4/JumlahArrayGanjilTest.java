import static org.junit.Assert.*;
import org.junit.Test;

public class JumlahArrayGanjilTest {
    @Test
    public void test00(){
        assertEquals(9, JumlahArrayGanjil.jumlahArrayGanjil(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void test01(){
        assertEquals(3, JumlahArrayGanjil.jumlahArrayGanjil(new int[] {4, 2, 3, 8, 120}));
    }

    @Test
    public void test02(){
        assertEquals(0, JumlahArrayGanjil.jumlahArrayGanjil(new int[] {2, 4, 6, 8, 10}));
    }
}

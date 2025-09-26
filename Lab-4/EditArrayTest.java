import static org.junit.Assert.*;
import org.junit.Test;

public class EditArrayTest{
    @Test
    public void editTest01(){
        String[] data = {"Amir","Budi","Ceci","Dudi"};
        String[] out1 = {"Amir","Baba","Ceci","Dudi"};
        assertArrayEquals(out1, EditArray.editArray(data, 1, "Baba"));

        assertArrayEquals(new String[]{"Amir","Budi","Ceci","Dudi"},data);
    }
}
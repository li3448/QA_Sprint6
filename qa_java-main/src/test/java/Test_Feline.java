import com.example.*;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Test_Feline {
//Проверка принадлежащего семейства
    @Test
    public void Test_Family() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Некорректный результат теста", expected, actual);
    }
//Проверка, являются ли детеныши котятами
    @Test
    public void kittensTest() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Некорректный результат теста", expected, actual);
    }
//Проверка числа котят
    @Test
    public void numberofkittens() {
        Feline feline = new Feline();
        int expected = 5;
        int actual = feline.getKittens(5);
        assertEquals("Некорректный результат теста", expected, actual);
    }

}

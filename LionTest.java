import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        int expected = 3;
        int actual = lion.getKittens();
        assertEquals("Некорректный результат теста", expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getSexExceptionTest() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("самей", feline);
            lion.doesHaveMane();
        });
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}


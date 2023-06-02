import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;
//проверка на ожидаемый голос
    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals("Неверный результат теста", expected, actual);
    }
//Проверка на употребляемую пищу
    @Test
    public void foodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFoodList);
        List<String> expected = expectedFoodList;
        List<String> actual = cat.getFood();
        assertEquals("Неверный результат теста", expected, actual);
    }

    }

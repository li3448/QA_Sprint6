import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
@RunWith(Parameterized.class)
public class Test_Lion {

        Feline feline = Mockito.mock(Feline.class);
        private final String sex;
        private final Boolean haveMane;
        public LionTest(String sex, Boolean haveMane){
            this.sex = sex;
            this.haveMane = haveMane;
        }
        @Parameterized.Parameters
        public static Object[][] setData(){
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false}
            };
        }

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        int expected = 3;
        int actual = lion.getKittens();
        assertEquals("Результат теста не соответствует ожидаемому", expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

}

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void checkLengthGenerateArr(){
        Generator generator = new Generator();

        assertEquals(10, generator.generator(10).length);
        assertNull(generator.generator(1));

    }
    @Test
    void checkFirstMoreSecond(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,5,6};
        assertEquals("Первый список имеет большее среднее значение", new Program(arr1, arr2).calcAverageValue());
    }
    @Test
    void checkSecondMoreFirst(){
        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5};
        assertEquals("Второй список имеет большее среднее значение", new Program(arr1, arr2).calcAverageValue());
    }
    @Test
    void checkValuesEqual(){
        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {2,3,4,5,6};
        assertEquals("Средние значения равны", new Program(arr1, arr2).calcAverageValue());
    }
    @Test
    void checkIntegration(){
        int length = 10;
        Generator generator = new Generator();
        int[] arr1 = generator.generator(length);
        int[] arr2 = generator.generator(length);
        Program program = new Program(arr1, arr2);

        if(Arrays.stream(arr1).sum() / length > Arrays.stream(arr2).sum() / length){
            assertEquals("Первый список имеет большее среднее значение", new Program(arr1, arr2).calcAverageValue());
        } else if(Arrays.stream(arr1).sum() / length < Arrays.stream(arr2).sum() / length){
            assertEquals("Второй список имеет большее среднее значение", new Program(arr1, arr2).calcAverageValue());
        } else if(Arrays.stream(arr1).sum() / length == Arrays.stream(arr2).sum() / length){
            assertEquals("Средние значения равны", new Program(arr1, arr2).calcAverageValue());
        }
    }
}

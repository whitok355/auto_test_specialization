import org.mockito.internal.matchers.Null;

import java.util.Random;

public class Generator {

    public int[] generator(int length){

        Random rnd = new Random();
        int[] numbers = new int[length];

        if(length > 2){
            for(int i = 0; i < length; i++){
                numbers[i] = rnd.nextInt(100);
            }
            return numbers;
        }
        return null;
    }
}

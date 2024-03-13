import org.junit.jupiter.api.BeforeEach;
import ja.hw.MainHW;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {
    MainHW mainHw;
    @BeforeEach
    void setUp(){
        mainHw = new MainHW();
    }


    //region HW 3.1.
    @ParameterizedTest
    @ValueSource(ints={2,4,6,8,10})
    void checkOddNumber(int n){
        assertTrue(mainHw.evenOddNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,9})
    void checkNotOddNumber(int n){
        assertFalse(mainHw.evenOddNumber(n));
    }
    //endregion

    //region HW 3.2.

    @ParameterizedTest
    @ValueSource(ints = {25, 30,50, 60, 100})
    void checkInInterval(int n){
        assertTrue(mainHw.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {24, 101, 200, 400,10,0})
    void checkNotInInterval(int n){
        assertFalse(mainHw.numberInInterval(n));
    }

    //endregion
}

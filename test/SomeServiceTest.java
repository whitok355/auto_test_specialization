import ja.coverage.SomeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class SomeServiceTest {
  SomeService someService;

  @BeforeEach
    void setUp(){someService = new SomeService();};

  //region CheckDiscount
  @Test
    void checkDiscount(){
      assertEquals(900, someService.calculatingDiscount(1000.0, 90));
  }
  @Test
  void checkAmount(){
      assertThatThrownBy(()-> someService.calculatingDiscount(0, 10))
              .isInstanceOf(ArithmeticException.class).hasMessage("The cost of the product cannot be equal to 0");
      assertThatThrownBy(()-> someService.calculatingDiscount(-10, 10))
              .isInstanceOf(ArithmeticException.class).hasMessage("The cost of the product cannot be equal to 0");
  }
    @Test
    void checkDiscountLessZero(){
      assertThatThrownBy(()-> someService.calculatingDiscount(1000, -10))
              .isInstanceOf(ArithmeticException.class).hasMessage("The discount cannot be less than 0");
    }
    @Test
    void checkDiscountMore100(){
        assertThatThrownBy(()-> someService.calculatingDiscount(1000, 101))
                .isInstanceOf(ArithmeticException.class).hasMessage("The discount cannot be more than 100%");
    }
  @Test
    void checkFinalAmountAndPurchaseAmount(){
      assertThatThrownBy(()-> someService.calculatingDiscount(1000, 100))
              .isInstanceOf(ArithmeticException.class).hasMessage("Final amount cannot less ore equal be purchase amount");
  }
  //endregion

  //region Check fizzBuzz

  @ParameterizedTest
  @ValueSource(ints = {15, 45, 60})
  void checkFizzBuzz(int n){
    assertEquals("FizzBuzz", someService.fizzBuzz(n));
  }
  @ParameterizedTest
  @ValueSource(ints = {5, 20, 35})
  void checkBuzz(int n){
    assertEquals("Buzz", someService.fizzBuzz(n));
  }
  @ParameterizedTest
  @ValueSource(ints={3, 6, 9})
  void checkFizz(int n){
    assertEquals("Fizz", someService.fizzBuzz(n));
  }
  @ParameterizedTest
  @ValueSource(ints = {1,2,7,11})
  void checkGetSendValue(int n){
    assertEquals(""+n, someService.fizzBuzz(n));
  }
  //endregion

  //region FirstLast6

  @Test
  void checkFirstSix(){
    assertTrue(someService.firstLast6(new int[]{6,2,3,4,5}));
  }
  @Test
  void checkLastSix(){
    assertTrue(someService.firstLast6(new int[]{1,2,3,4,5,6}));
  }
  @Test
  void checkNotSix(){
    assertFalse(someService.firstLast6(new int[]{1,2,3,4,5}));
  }
  //endregion
}

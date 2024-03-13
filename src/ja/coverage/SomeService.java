package ja.coverage;

import java.io.IOException;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int i) {
        if(i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        } else if(i % 5 == 0){
            return "Buzz";
        } else if ( i % 3 == 0){
            return "Fizz";
        } else{
            return "" + i;
        }
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length-1] == 6){
            return true;
        }
        return false;
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double finalAmount = purchaseAmount * ((double)discountAmount / 100);

        if (purchaseAmount <= 0){
            throw new ArithmeticException("The cost of the product cannot be equal to 0");
        } else if(discountAmount < 0){
            throw new ArithmeticException("The discount cannot be less than 0");
        } else if(discountAmount > 100){
            throw new ArithmeticException("The discount cannot be more than 100%");
        }  else if(purchaseAmount <= finalAmount){
            throw new ArithmeticException("Final amount cannot less ore equal be purchase amount");
        }
        return finalAmount;
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */


}
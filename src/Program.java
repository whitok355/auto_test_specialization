import java.util.Arrays;
import java.util.stream.IntStream;

public class Program {
    private final int[] arr1;
    private final int[] arr2;
    public Program(int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
    String calcAverageValue(){
        int average1 = Arrays.stream(arr1).sum() / arr1.length;
        int average2 = Arrays.stream(arr2).sum() / arr2.length;

        if(average1 > average2){
            return "Первый список имеет большее среднее значение";
        } else if(average1 < average2){
            return "Второй список имеет большее среднее значение";
        } else if(average1 == average2){
            return "Средние значения равны";
        } else{
            return null;
        }
    }
}

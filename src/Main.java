public class Main {
    public static void main(String[] args) {

        Program pr = new Program(
                new Generator().generator(10),
                new Generator().generator(10)
        );

        System.out.println(pr.calcAverageValue());
    }
}

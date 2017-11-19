package yanevskyy.lesson1.solutionArrays;

/**
 * Created by MM on 19.11.2017.
 */
public class StartProgram {
    public static void main(String[] args) {
        int findNumber;
        SolutionLogical solutionLogical;
        for (int i = 8; i < 18; i++) {
            findNumber = (int) (Math.random() * i);
            System.out.println("==================================");
            System.out.println("Создадим последовательность из " + i + " чисел и пропустим число " + findNumber);
            System.out.println();
            solutionLogical = new SolutionLogical(findNumber, i);
            solutionLogical.createArray();
        }
    }


}

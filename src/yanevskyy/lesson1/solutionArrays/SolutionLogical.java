package yanevskyy.lesson1.solutionArrays;

/**
 * Created by MM on 19.11.2017.
 */
public class SolutionLogical {
    private int notNumber;
    private int lengthArray;
    private int[] array;
    private int sum = 0;

    public SolutionLogical(int notNumber, int lengthArray) {
        this.notNumber = notNumber;
        this.lengthArray = lengthArray;
        this.array = new int[lengthArray - 1];
    }

    /**
     * Sums oll objects in arrays.
     */
     private int sumList(){
         for (int i = 0; i < lengthArray; i++) {
             sum += i + 1;
         }
         return sum;
     }

    /**
     * Fill array
     */
    public void createArray(){
        if (notNumber < 1 || lengthArray < 2){
            System.out.println("Не подходящие значения. Попробуйте снова");
            return;
        }
        int count = lengthArray;
        for (int i = 0; i < array.length; i++) {
            if (count != notNumber) {
                array[i] = count;
            } else {
                i--;
            }
            count--;
        }
        System.out.println("Создан последовательный массив из " + array.length + "- чисел.");
        System.out.println();
        sumList();
        findInteger();

    }

    /**
     * find number.
     */
    private void findInteger(){
        System.out.println("Начинаем поиск");

        for (int i = 0; i < array.length; i++) {
            sum -=array[i];
        }
        System.out.println("Найдено число " + sum);
        System.out.println("==================================");
    }


}

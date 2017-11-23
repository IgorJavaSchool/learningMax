package lesson1.task2;

/**
 * Created by MM on 19.11.2017.
 */
public class NumberFinder {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6,7,8,9}; //10
        int[] list2 = {1,2,3,4,5,6,7,9,10};//8
        int[] list3 = {1,2,3,4,5,6,8,9,10};//7
        int[] list4 = {1,2,3,4,5,7,8,9,10};//6
        int[] list5 = {1,2,3,4,6,7,8,9,10};//5

        NumberFinder numberFinder = new NumberFinder();
        numberFinder.findNumber(list1);
        numberFinder.findNumber(list2);
        numberFinder.findNumber(list3);
        numberFinder.findNumber(list4);
        numberFinder.findNumber(list5);
    }

    public void findNumber(int[] array){
        int sum = sumsSequenceNumbers(array.length + 1);
        for (int i = 0; i < array.length; i++) {
            sum -=array[i];
        }
        System.out.println("Найдено число " + sum);
    }

    /**
     * Finds sum of sequence numbers by recursion method.
     * @param sequence
     * @return
     */
    public int sumsSequenceNumbers(int sequence){
        int sum = 0;
        while (sequence > 0){
            sum +=sequence;
            sumsSequenceNumbers(--sequence);
        }
        return sum;
    }

}

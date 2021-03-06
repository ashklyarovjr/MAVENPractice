package methods.lab1;


//Lab 1 Task 3

public class BubbleSorterInverted {
    public static void sort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int barrier = 0; barrier < arr.length; barrier++) {

            for (int index = arr.length - 1; index > barrier; index--) {

                if (arr[index] < arr[index - 1]) {

                    int tmp = arr[index];

                    arr[index] = arr[index - 1];

                    arr[index - 1] = tmp;

                }

            }

        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("BubbleSort time is: " + finish + " ms");

    }

}

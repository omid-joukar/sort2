import java.util.Arrays;

/**
 * Created by KPS on 7/15/2020.
 */
public class Main {
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));
        ob.bubbleSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));
    }
}


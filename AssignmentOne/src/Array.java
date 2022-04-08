import java.util.Arrays;
public class Array {
    private static void check(int[] arr, int CheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == CheckValue) {
                test = true;
                break;
            }
        }

        System.out.println("Is " + CheckValue
                + " present in the array: " + test);
    }

    public static void main(String[] args)
    {

        int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23,26,35,37,7,52,86,47 };

        int CheckValue = 19;

        System.out.println("Array: "
                + Arrays.toString(arr));



        check(arr, CheckValue);
    }
}

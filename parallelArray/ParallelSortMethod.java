package parallelArray;
import java.util.Arrays;

public class ParallelSortMethod {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 9};
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
    }
}

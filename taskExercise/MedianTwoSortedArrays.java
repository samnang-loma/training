package taskExercise;
import java.util.Arrays;

public class MedianTwoSortedArrays {
    public static double medianSortedArr(int[] nums1, int[] nums2) {
        int i,j;
        int [] arr = new int[nums1.length + nums2.length];
        for(i=0; i<nums1.length; i++){
            arr[i]=nums1[i];
        }
        for(j=0; j<nums2.length; j++){
            arr[i+j]=nums2[j];
        }

        Arrays.sort(arr);
        double median;
        if(arr.length %2==0)
            median = (arr[arr.length/2-1] + arr[arr.length/2])/2.0;
        else
            median = arr[arr.length/2];
        return median;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 2};

        double median = medianSortedArr(nums1, nums2);
        System.out.println("Median: " + median);
    }


}

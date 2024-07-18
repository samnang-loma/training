package taskExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i : a)
            li.add(i);
        for (int i : b)
            li.add(i);
        Collections.sort(li);
        double median=0;
        if (li.size() % 2 != 0)
            median =  li.get(li.size() / 2);
        if (li.size() % 2 == 0)
            median =  ((li.get(li.size() / 2) + li.get(li.size() / 2 - 1))) / 2;
        return median;
    }

}
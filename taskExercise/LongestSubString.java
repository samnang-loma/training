package taskExercise;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static int longestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int left = 0;
            int ans = 0;
//          here i tried to check char of the given string in while loop whether it's dpl or not
//          i let left variable as an index of char that i tried to eliminate from the set
//          the tricky part here is, shall we keep the left variable as static position at index 0 or what?
//          if so, it worked only with the 2nd case, "bbbbb", however, in the 1st case, and the 3rd "abcabcbb", "pwwkew" the while loop will not be break.
//          i tried to move the left varible to next position after i removed one char from the set, then after the while loop execute, i will add the char
//          from string at that index to the set, and it works with all these 3 test cases
            for (int i = 0; i < s.length(); i++) {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i));
                ans = Math.max(set.size(), ans);
            }
            return ans;
        }
        public static void main(String[] args) {
            System.out.println(longestSubstring("abcabcbb"));
            System.out.println(longestSubstring("bbbbb"));
            System.out.println(longestSubstring("pwwkew"));
        }
}

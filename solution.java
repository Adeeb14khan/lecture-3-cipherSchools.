// Java program to find the length of the longest substring without repeating characters
import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                ans = Math.max(ans, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String test = "abcabcbb";
        System.out.println("Input: " + test);
        int result = lengthOfLongestSubstring(test);
        System.out.println("Length of Longest Substring without repeating characters: " + result);
    }
}

Solution:-
  import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        int[] maxCount = new int[26];
        for (String word : words2) {
            int[] count = countChars(word);
            for (int i = 0; i < 26; i++) {
                maxCount[i] = Math.max(maxCount[i], count[i]);
            }
        }

       
        List<String> result = new ArrayList<>();
        for (String word : words1) {
            int[] count = countChars(word);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (count[i] < maxCount[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(word);
            }
        }

        return result;
    }

    private int[] countChars(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a'] += 1;
        }
        return count;
    }
}

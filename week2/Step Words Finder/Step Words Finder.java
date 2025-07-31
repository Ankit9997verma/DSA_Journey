
import java.util.*;

public class StepWord {
    
    // Function to get character frequency as int[26]
    static int[] getCharFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    // Check if candidate is a valid step word of base
    static boolean isValidStepWord(int[] baseFreq, String candidate) {
        if (candidate.length() != baseFreq.length + 1) return false;

        int[] candFreq = getCharFreq(candidate);
        int extra = 0;

        for (int i = 0; i < 26; i++) {
            if (candFreq[i] < baseFreq[i]) return false;
            extra += candFreq[i] - baseFreq[i];
        }

        return extra == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Read input word
        String baseWord = sc.nextLine().trim().toLowerCase();
        int baseLen = baseWord.length();
        int[] baseFreq = getCharFreq(baseWord);

        // 🔹 Read dictionary
        int n = Integer.parseInt(sc.nextLine());
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine().trim().toLowerCase();
            if (word.length() == baseLen + 1 && isValidStepWord(baseFreq, word)) {
                result.add(word);
            }
        }

        // 🔹 Sort and print result
        Collections.sort(result);
        for (String word : result) {
            System.out.println(word);
        }
    }
}

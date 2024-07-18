package sel.bootcamp.part1_DifficultSection;

import java.util.HashSet;
import java.util.Set;

public class F_LongestCommonSubsequence {

    // Function to find the length of the longest common subsequence
    public static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        // we create a 2-D array with by using m+1 and n+1: 
        // the algorithm can directly use the length of the strings s1 and s2 for indexing without having to adjust indices 
        int[][] dp = new int[m+1][n+1];

        // Building the dp array
        for (int i = 1; i <= m; i++) {				// rows
            for (int j = 1; j <= n; j++) {			// cols
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }

    // Function to retrieve the longest common subsequence
    public static String getLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        String LCSRepeated = "";

        // Building the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                	LCSRepeated = LCSRepeated+ s1.charAt(i-1);
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return removeRepeatedLetters(LCSRepeated);

    }
    
    public static String removeRepeatedLetters(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
    	String s1 = "GXTXAYB";
    	String s2 = "AGGTAB";

        System.out.println("Length of LCS: " + lcs(s1, s2));
        System.out.println("LCS: " + getLCS(s1, s2));
    }
}

package problem;

//10. Regular Expression Matching
//        Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
//
//        '.' Matches any single character.
//        '*' Matches zero or more of the preceding element.
//        The matching should cover the entire input string (not partial).
//
//
//
//        Example 1:
//
//        Input: s = "aa", p = "a"
//        Output: false
//        Explanation: "a" does not match the entire string "aa".
//        Example 2:
//
//        Input: s = "aa", p = "a*"
//        Output: true
//        Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
//        Example 3:
//
//        Input: s = "ab", p = ".*"
//        Output: true
//        Explanation: ".*" means "zero or more (*) of any character (.)".
//
//
//        Constraints:
//
//        1 <= s.length <= 20
//        1 <= p.length <= 20
//        s contains only lowercase English letters.
//        p contains only lowercase English letters, '.', and '*'.
//        It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.

public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        int dp[][]=new int[s.length()+1][p.length()+1];
        return sol(s,p,dp);
    }
    public static boolean sol(String s,String p,int[][] dp){
        int m=s.length(),n=p.length();
        if(n==0) return m==0;
        if(dp[m][n]!=0) return dp[m][n]==1;
        boolean f=(s.length()>0 && (s.charAt(0)==p.charAt(0) || p.charAt(0)=='.'));
        boolean ans=false;
        if(n>1 && p.charAt(1)=='*'){
            ans=(sol(s,p.substring(2),dp) || (f && sol(s.substring(1),p,dp)));
        }else{
            ans=(f && sol(s.substring(1),p.substring(1),dp));
        }
        if(ans) dp[m][n]=1;
        else dp[m][n]=-1;
        return ans;
    }


    public static boolean isMatch1(String s, String p) {
        int[][] dp = new int[s.length()][p.length()];
        return isValid(s.length()-1, p.length()-1,s,p,dp);
    }

    public static boolean isValid(int sIdx, int pIdx, String s, String p, int[][] dp) {
        if(pIdx==-1) return sIdx == -1;
        if(sIdx==-1) {
            while(pIdx >=0) {
                if(p.charAt(pIdx)!='*') return false;
                pIdx-=2;
            }
            return true;
        }
        if(dp[sIdx][pIdx]!=0) return dp[sIdx][pIdx]==1;
        char sCh = s.charAt(sIdx);
        char pCh = p.charAt(pIdx);
        boolean validity = false;
        if(sCh==pCh) validity = isValid(sIdx-1,pIdx-1,s,p,dp);
        else if(pCh=='.') validity = isValid(sIdx-1,pIdx-1,s,p,dp);
        else if(pCh=='*') {
            validity = isValid(sIdx,pIdx-2,s,p,dp);
            if(!validity && (p.charAt(pIdx-1) == sCh || p.charAt(pIdx-1)=='.')) {
                validity = isValid(sIdx-1,pIdx,s,p,dp);
            }
        }
        dp[sIdx][pIdx] = validity ? 1 : -1;
        return validity;
    }
    public static void main(String[] args) {
        System.out.println(isMatch1("aa", "a"));
        System.out.println(isMatch1("aa", "a*"));
        System.out.println(isMatch1("ab", ".*"));
        System.out.println(isMatch1("baa", "b."));
        System.out.println(isMatch1("aab", "c*a*b"));
    }
}

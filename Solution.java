public class Solution {
    public int TermOfGP(int a, int b, int N) {
        int r = b / a; 
        int term = a * (int)Math.pow(r, N - 1); 
        return term; 
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.TermOfGP(1,2,5)); 
    }
        
}

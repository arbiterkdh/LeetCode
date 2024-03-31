class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length()/2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(s.length()-1-i);
            if (c1!=c2) return false;
        }
        return true;
    }
}
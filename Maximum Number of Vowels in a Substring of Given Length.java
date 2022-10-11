class Solution {
   public int maxVowels(String s, int k) {
        Set<Character> st = Set.of('a','e','i','o','u');
        int res = 0;
        for (int l = 0, r = 0, cnt = 0; r < s.length(); r++) {
            if (st.contains(s.charAt(r))) cnt++;
            if (r >= k && st.contains(s.charAt(l++))) cnt--;
            res = Math.max(res, cnt);
            if (res == k) return res;
        }
        return res;
    }
}

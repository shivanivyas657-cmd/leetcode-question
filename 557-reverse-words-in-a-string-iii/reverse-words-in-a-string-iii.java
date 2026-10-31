
class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");

        for (String w : words) {
            ans.append(new StringBuilder(w).reverse()).append(" ");
        }

        ans.setLength(ans.length() - 1);
        return ans.toString();
    }
}

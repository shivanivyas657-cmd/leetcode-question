class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        String ans="";
        for(String w:a){
            StringBuilder sb = new StringBuilder(w);
            ans+=sb.reverse()+" ";
        }
        return ans.trim();
        
    }
}
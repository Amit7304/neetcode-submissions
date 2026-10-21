class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
        char[] s_charArray = s.toCharArray();
        char[] t_charArray = t.toCharArray();

        Arrays.sort(s_charArray);   
        Arrays.sort(t_charArray); 
        if(Arrays.equals(s_charArray,t_charArray)){
            return true;
        }
        else{
            return false;
        }
        }
        else{
            return false;
        }
    }
}

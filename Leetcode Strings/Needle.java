import java.util.*;
class Needle{
	public int strStr(String s1, String s2) {
       
        if (s2.isEmpty()) {
            return 0;
        }
        
        
        int index = s1.indexOf(s2);
        
        
        return index;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        String s1 = "sadbutsad";
        String s2 = "sad";
        System.out.println(solution.strStr(s1, s2)); // Output: 0
        
        
        String s3 = "leetcode";
        String s4 = "leeto";
        System.out.println(solution.strStr(s3, s4)); // Output: -1
    }
}
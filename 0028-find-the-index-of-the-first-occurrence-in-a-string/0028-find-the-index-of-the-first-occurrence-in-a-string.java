class Solution {
    public int strStr(String haystack, String needle) {
        
    
        int n = needle.length();
        

        for(int i =0; i <= haystack.length() - n; i++)
        {
           String result = haystack.substring(i,i+n);
           if(result.equals(needle))
           {
              return i;
           }
        }
        return -1;
    }
}
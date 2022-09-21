class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character, Integer> map = new HashMap<Character,Integer>();
        
        int i=0,max=0;
        
        for(int j=0; j<s.length(); ++j){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(s.charAt(j))+1);
            }
            map.put(s.charAt(j),j);
            max = Math.max(max,j-i+1);
        }
        return max;
        
        
        
        // int n=s.length(),res=0;
        // int prev[] = new int[256];
        // int i=0; 
        // Arrays.fill(prev,-1);
        // for(int j=0; j<s.length(); j++)
        // {
        //     i = Math.max(i,prev[s.charAt(j)]+1);
        //     int maxEnd = j-i+1;
        //     res = Math.max(res,maxEnd);
        //     prev[s.charAt(j)]=j;
        // }
        // return res;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
         if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
//        Map<Character, Integer> map = new HashMap<Character,Integer>();
        
//         int i=0,max=0;
        
//         for(int j=0; j<s.length(); ++j){
//             if(map.containsKey(s.charAt(j))){
//                 i = Math.max(i,map.get(s.charAt(j))+1);
//             }else{
//                map.put(s.charAt(j),j);
//                 max = Math.max(max,j-i+1);
//             }
//         }
//             return max;
        
        
        
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
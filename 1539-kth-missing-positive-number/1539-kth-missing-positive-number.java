class Solution {
    public int findKthPositive(int[] arr, int k) {
        // ArrayList<Integer> al = new ArrayList<>();
        // int n= arr.length;
        // for(int i=0;i<n;i++)
        //     al.add(arr[i]);
        // int i=1;
        int temp=0;
        int i=0;
        int j=1;
        int count=0;
       while(count<k && i<arr.length)
       {
           if(arr[i]==j)
           {
               i++;
               j++;
           }
           else{
               count++;
               temp=j;
               j++;
           }
       }
        if(count<k)
            return (j+(k-count-1));
        
        return temp;
    }
}
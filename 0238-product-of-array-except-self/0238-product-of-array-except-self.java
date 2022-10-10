class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int mul=1;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cnt++;
                continue;
                
            }
            mul=mul*nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(cnt>1){
                    nums[i]=0;
                }
                else{
                    nums[i]=mul;
                }
            }
            else{
                if(cnt>0){
                    nums[i]=0;
                }
                else{
                    nums[i]=mul/nums[i];
                }
            }
            
        }
        return nums;
       
    }
}
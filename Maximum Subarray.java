class Solution {
    public int maxSubArray(int[] nums) {
       int Maxsum=nums[0];
       int Currsum=0;
       for(int n:nums){
        Currsum+=n;
        Maxsum=Math.max(Maxsum,Currsum);
        if(Currsum<0){
            Currsum=0;
        }
       }
       return Maxsum;

	}   

}

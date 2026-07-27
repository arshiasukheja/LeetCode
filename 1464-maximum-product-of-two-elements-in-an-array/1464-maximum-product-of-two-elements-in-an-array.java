class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        int idx=0; 

        for (int i=0 ; i<nums.length; i++){
            if (nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }

         for (int i=0 ; i<nums.length; i++){
            if (nums[i]>=secMax && i!=idx){
                secMax=nums[i];
            }
        }

        max=max-1;
        secMax=secMax-1;

        return (max* secMax);


    }
}
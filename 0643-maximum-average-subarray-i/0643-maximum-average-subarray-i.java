class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        long sum=0;
        for (int r=0; r<k; r++){
             sum+=nums[r];
        }

        double maxVal=(double)sum/k;

        for (int r=k; r<nums.length; r++){
            sum+=nums[r];
            sum-=nums[l];
            l++;

            double avg=(double)sum/k;

            maxVal=Math.max(maxVal,avg);
        }

        return maxVal;

        
    }
}
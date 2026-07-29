class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       
        int bestSum=0;
        int bestDiff=Integer.MAX_VALUE;
        for (int i = 0; i<nums.length-2; i++){
            int l = i+1;
            int r=nums.length-1;

            while (l<r){
                int sum=  nums[i]+nums[l]+nums[r];
                int diff = Math.abs(target-sum);
                if (bestDiff>diff){
                    bestDiff=diff;
                    bestSum=sum;
                }               
                if (sum==target) return sum;
                else if (sum>target) r--;
                else l++;

            }

        }

        return bestSum;
    }
}
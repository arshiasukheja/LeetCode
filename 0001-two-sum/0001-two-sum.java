class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        
        for (int i=0; i<n; i++){
            int a=nums[i];
            int b=target-a;
            for (int j=i+1; j<n; j++){
                if (nums[j]==b){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
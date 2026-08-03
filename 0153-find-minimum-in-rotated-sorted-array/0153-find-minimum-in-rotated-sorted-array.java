class Solution {
    public int findMin(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int l=0;
        int r=nums.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;
            if (nums[mid]<=smallest){
                smallest=nums[mid];
            }

            if (nums[l]<=nums[mid]){
                smallest=Math.min(smallest,nums[l]);
                l=mid+1;
            } else {
                smallest=Math.min(smallest,nums[mid]);
                r=mid-1;
            }
        }
        return smallest;
    }
}
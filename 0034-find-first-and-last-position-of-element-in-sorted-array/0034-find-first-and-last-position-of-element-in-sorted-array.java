class Solution {
    public int[] searchRange(int[] nums, int target) {
        int sIdx=-1;
        int eIdx=-1;
        int l=0;
        int r=nums.length-1;

        while (l<=r){
            int mid=l+(r-l)/2;
            if (nums[mid]==target){
                sIdx=mid;
                r=mid-1;
            } else if (nums[mid]>target){
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        // this loop gives me the starting index 
        l=0;
        r=nums.length-1;
        
         while (l<=r){
            int mid=l+(r-l)/2;
            if (nums[mid]==target){
                eIdx=mid;
                l=mid+1;
            } else if (nums[mid]>target){
                r=mid-1;
            } else {
                l=mid+1;
            }
        }
        // this loop gives me the last index 

       return new int[] {sIdx, eIdx};

        
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         int l=0;
         HashSet <Integer> set= new HashSet<>();

       if (k >= nums.length) {
    k = nums.length - 1;
}


         for (int r=0;r<=k; r++){
            if (set.contains(nums[r])){
                return true;
            }
            set.add(nums[r]);
         }

         for (int r=k+1; r<nums.length; r++){
         
             set.remove(nums[l]);
             if (set.contains(nums[r])){
                return true; 
            }

            set.add(nums[r]);
            l++;



         }

         return false;
    }
}

// k is indirectly the window size 
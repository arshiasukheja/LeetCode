class Solution {
    public int missingInteger(int[] nums) {
        int idx=nums.length-1;
        for (int i=0 ; i<nums.length-1; i++){
            if ((nums[i]+1)!=nums[i+1]){
                idx=i;
                break;
            }
        }

        // sum 
        int sum=0;
        for (int i=0 ; i<=idx; i++){
            sum+=nums[i];
        }
        int candidate= sum;
     
       while (true){
        boolean exists=false;

        for (int i=0;i<nums.length; i++){
            if (candidate==nums[i]){
                exists=true;
                break;
            }
        }

        if (!exists){
           return candidate++;
        }

         candidate++;
       }

        

    }
}
class Solution {
    public int[] runningSum(int[] nums) {
        
        int [] array= new int[nums.length];
        int sum=nums[0];
        array[0]=nums[0];
        for (int i=1; i<nums.length; i++){
            array[i]=nums[i]+sum;
            sum=array[i];
        }

        return array;
        
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
         int l=0;
         int r=nums.length-1;
         int k=nums.length-1;

         int[] result=new int[nums.length];

         while (l<=r){

              if (Math.abs(nums[l])>Math.abs(nums[r])){
                    result[k]=nums[l]*nums[l];
                    l++;

              } else  {
                result[k]=nums[r]*nums[r];
                r--;
              } 

              k--;

         }

           

            return result;


         }
    }

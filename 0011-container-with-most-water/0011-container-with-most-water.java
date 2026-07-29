class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int units=0;
       
        while (l<=r){
            
            if (height[l]<height[r]){
                int water=height[l]*(r-l);
                if (water>=units){
                    units=water;
                }
                l++;
            } else {
                 int water=height[r]*(r-l);
                if (water>=units){
                    units=water;
                }
                r--;
            }


        }

        return units;
    }
}
class Solution {
    public int mySqrt(int x) {
        int l=1;
        int r=x;
        int op=0;

        if (x==1) return 1;

        while (l<=r){
            int mid= l+(r-l)/2;
            if ((long)mid*mid == x){
                return mid;
            } else if ((long)mid*mid <x){
                op = mid;
                l=mid+1;
            } else {
                r = mid-1;
            }
        }
        return op;
    }
}
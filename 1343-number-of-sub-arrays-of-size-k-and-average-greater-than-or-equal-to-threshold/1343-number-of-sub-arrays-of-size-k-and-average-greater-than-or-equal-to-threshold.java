class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int l=0;
        int count=0;
        long sum=0;
        for (int r=0 ; r<k; r++){
             sum+=arr[r];
        }

        double avg=(double)sum/k;
        if (avg>=threshold) count++;

        for (int r=k ; r<arr.length; r++){
            sum+=arr[r];
            sum-=arr[l];
            l++;

        avg=(double)sum/k;
        if (avg>=threshold) count++;

        }

        return count;
    }
}
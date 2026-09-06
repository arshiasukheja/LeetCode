class Solution {

    public void backtrack (int[] nums, List<List<Integer>>result, List<Integer> current, int i ){
        if (i==nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        backtrack(nums,result,current,i+1);

        current.remove(current.size()-1);
        backtrack(nums,result,current,i+1);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // store subsets 
        List<Integer> current= new ArrayList<>(); // each subset 
        int index=0;

        backtrack(nums,result,current,index);     
        return result;   
    }
}
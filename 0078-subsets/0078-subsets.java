class Solution {

    public void backtrack(int[] nums,  List<List<Integer>> result, List<Integer> current, int idx){
        if (idx==nums.length) {
            result.add(new ArrayList<Integer>(current));
            return;
        }

        current.add(nums[idx]);
        backtrack(nums, result, current, idx+1);
        current.remove(current.size()-1);
        backtrack(nums, result, current, idx+1);
    }




    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        int idx=0;

        backtrack(nums, result, current, idx);
        return result;

    }
}
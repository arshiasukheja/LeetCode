class Solution {

    public void backtrack(int[] nums, int idx, List<List<Integer>>result , List<Integer>current){

        if (idx==nums.length){
            result.add(new ArrayList<Integer> (current));
            return;
        }
        
        current.add(nums[idx]);
        backtrack(nums, idx+1, result, current);
        
        current.remove(current.size()-1);
        while (idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        backtrack(nums, idx+1, result, current);
    }



    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        int idx=0;
        backtrack(nums, idx, result , current);

        return result;
    }
}